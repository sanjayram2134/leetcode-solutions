class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
  
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        int numOfPrerequisites = prerequisites.length;

     
        for (int i = 0; i < numOfPrerequisites; i++) {
            int course = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];
            adjacencyList.get(prerequisite).add(course);
        }

        

      
        int[] inDegree = new int[numCourses];

        
        for (int i = 0; i < numCourses; i++) {
            for (int neighbor : adjacencyList.get(i)) {
                inDegree[neighbor]++;
            }
        }

       
        Queue<Integer> queue = new LinkedList<>();

       
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        int[] topologicalOrder = new int[numCourses];
        int index = 0;

      
        while (!queue.isEmpty()) {
            int course = queue.peek();
            queue.remove();
            topologicalOrder[index++] = course;

           
            for (int neighbor : adjacencyList.get(course)) {
                inDegree[neighbor]--;

                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

       
        if (index == numCourses) {
            return topologicalOrder;
        }

     
        int[] emptyArray = {};
        return emptyArray;
    }
}