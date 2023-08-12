class Solution {
    
   // ithu naa podala makaleyyyy.
        
         public List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer, Map<String, Integer>> tableInfo = new HashMap<>();
        Set<String> foodItems = new TreeSet<>();
        TreeSet<Integer> tableNumbers = new TreeSet<>();

        // Populate the tableInfo map and tableNumbers set
        for (List<String> order : orders) {
            int tableNumber = Integer.parseInt(order.get(1));
            String foodItem = order.get(2);

            tableInfo.putIfAbsent(tableNumber, new HashMap<>());
            tableInfo.get(tableNumber).put(foodItem, tableInfo.get(tableNumber).getOrDefault(foodItem, 0) + 1);
            foodItems.add(foodItem);
            tableNumbers.add(tableNumber);
        }

        List<List<String>> displayTable = new ArrayList<>();
        List<String> headerRow = new ArrayList<>();
        headerRow.add("Table");
        headerRow.addAll(foodItems);
        displayTable.add(headerRow);

        // Create the rows for each table
        for (int tableNumber : tableNumbers) {
            Map<String, Integer> foodCounts = tableInfo.get(tableNumber);
            List<String> row = new ArrayList<>();
            row.add(Integer.toString(tableNumber));
            for (String foodItem : foodItems) {
                row.add(Integer.toString(foodCounts.getOrDefault(foodItem, 0)));
            }
            displayTable.add(row);
        }

        
        return displayTable;
    }
    


    
}