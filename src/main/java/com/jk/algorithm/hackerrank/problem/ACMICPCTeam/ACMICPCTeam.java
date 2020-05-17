package com.jk.algorithm.hackerrank.problem.ACMICPCTeam;

public class ACMICPCTeam {
    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int maxTopic = 0;
        int maxTopicTeam = 1;

        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                int tempTopicLength = 0;
                char[] topicI = topic[i].toCharArray();
                char[] topicJ = topic[j].toCharArray();

                int charLength = topicI.length;

                for (int k = 0; k < charLength; k++) {
                    tempTopicLength += topicI[k] == '1' || topicJ[k] == '1' ? 1 : 0;
                }

                if (maxTopic < tempTopicLength) {
                    maxTopic = tempTopicLength;
                    maxTopicTeam = 1;
                } else if (maxTopic == tempTopicLength) {
                    maxTopicTeam++;
                }
            }
        }

        return new int[] {maxTopic, maxTopicTeam};
    }
}
