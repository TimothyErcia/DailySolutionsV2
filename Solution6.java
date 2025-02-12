/*
2115. Find All Possible Recipes from Given Supplies
You have information about n different recipes. You are given a string array recipes and a 2D string array ingredients. The ith recipe has the name recipes[i], and you can create it if you have all the needed ingredients from ingredients[i]. Ingredients to a recipe may need to be created from other recipes, i.e., ingredients[i] may contain a string that is in recipes.

You are also given a string array supplies containing all the ingredients that you initially have, and you have an infinite supply of all of them.

Return a list of all the recipes that you can create. You may return the answer in any order.

Note that two recipes may contain each other in their ingredients.
 */

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        ArrayList<String> arrList = new ArrayList();
        HashMap<String, Integer> hashmap = new HashMap();
        for(int i=0; i<ingredients.size(); i++) {
            for(int j=0; j<ingredients.get(i).size(); j++) {
                hashmap.put(ingredients.get(i).get(j), i);
            }
        }

        for(int k=0; k<supplies.length; k++) {
            if(hashmap.get(supplies[k]) != null) {
                hashmap.put(recipes[hashmap.get(supplies[k])], hashmap.size());
            }
        }

        for(int p=0; p<recipes.length; p++) {
            if(hashmap.containsKey(recipes[p])) {
                arrList.add(recipes[p]);
            }
        }
        return arrList;
    }
}