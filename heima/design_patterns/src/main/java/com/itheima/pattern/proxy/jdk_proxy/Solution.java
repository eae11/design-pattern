package com.itheima.pattern.proxy.jdk_proxy;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int validCandidatesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> validCandidates = IntStream.range(0, validCandidatesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int voteCastedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> voteCasted = IntStream.range(0, voteCastedCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        String result = Result.countVotes(validCandidates, voteCasted);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {



    public static String countVotes(List<String> validCandidates, List<String> voteCasted) {
        int max = Integer.MIN_VALUE;
        String maxCandidate = "";
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap();
        for (String vote : voteCasted) {
            if (validCandidates.contains(vote)) {
                map.put(vote, map.getOrDefault(vote, 0) + 1);
            } else {
                map.put("invalidVotes", map.getOrDefault(vote, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > max) {
                max = value;
                maxCandidate = key;
            }
            sb.append(key + "=" + value + " ");
        }
        if (maxCandidate == "invalidVotes") {
            sb.append("Winner=N/A");
        } else {
            sb.append("Winner=" + maxCandidate);
        }
        return sb.toString();
    }

}