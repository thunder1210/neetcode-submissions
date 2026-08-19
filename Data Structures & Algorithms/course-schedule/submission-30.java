class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> preList = new ArrayList<>();
        int[] indegree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            preList.add(new ArrayList<>());
        }

        for (int[] i : prerequisites) {
            int course = i[0];
            int preCourse = i[1];
            indegree[course]++;
            preList.get(preCourse).add(course);
        }

        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int count = 0;
        while (!q.isEmpty()) {
            count++;
            int course = q.poll();
            indegree[course]--;
            List<Integer> courseList = preList.get(course);
            for (int i : courseList) {
                indegree[i]--;
                if (indegree[i] == 0) {
                    q.offer(i);
                }
            }
        }
        return count == numCourses;
    }
}
