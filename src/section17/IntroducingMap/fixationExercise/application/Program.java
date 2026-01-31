package section17.IntroducingMap.fixationExercise.application;

import section17.IntroducingMap.fixationExercise.entities.Candidate;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        File path = new File("/home/arth/Documentos/Java-Nelio/pasta de teste/mapExercise.csv");

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            Map<String, Integer> candidateMap = new LinkedHashMap<>();

            String line = bf.readLine();
            while(line != null){
                String[] fields = line.split(",");
                int votes = Integer.parseInt(fields[1]);
                Candidate c = new Candidate (fields[0], votes);
                if (candidateMap.containsKey(c.getName())){
                    int oldValue = candidateMap.get(c.getName());
                    candidateMap.put(c.getName(), oldValue + votes);
                }else {
                    candidateMap.put(c.getName(), c.getVotes());
                }
                line = bf.readLine();
            }

            String nPath = "/home/arth/Documentos/Java-Nelio/pasta de teste/outPut candidate.txt";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(nPath))){
                for (String c : candidateMap.keySet()){
                    bw.write(c + ", " + candidateMap.get(c));
                    bw.newLine();
                }


            }catch (IOException e){
                System.out.println("Error writing file: "+ e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: "+ e.getMessage());
        }

    }
}
