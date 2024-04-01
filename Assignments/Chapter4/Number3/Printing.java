
public class Printing extends GroupedFoods{

    
    public void PrintBullet(String[] Element){
        for(int i = 0; i < Element.length; i++)
        System.out.println("* "+ Element[i]);
    }


    public void PrintElementInBullet(){
        GroupedFoods printBullet = new GroupedFoods();
        String[] FoodCategories = {"Vegetables", "Meat", "Fruit", "Poultry", "Dairy Products", "Consumable", "Beverages", "Condiments"};
        String[][] food ={printBullet.Vegetables, printBullet.Meat, printBullet.Fruit, printBullet.Poultry,
             printBullet.DairyProds,printBullet.Consumable,printBullet.Beverages, printBullet.Condiments};
            System.out.println("Food");
        for(int i = 0; i < FoodCategories.length; i++){
            System.out.println("-" + FoodCategories[i]);
            PrintBullet(food[i]);
        }
    }

    public void PrintTree(){
        GroupedFoods Tree = new GroupedFoods();

        String[] FoodCategories = {"Vegetables", "Meat", "Fruit", "Poultry", "Dairy Products", "Consumable", "Beverages", "Condiments"};
        String[][] food ={Tree.Vegetables, Tree.Meat, Tree.Fruit, Tree.Poultry,
             Tree.DairyProds,Tree.Consumable,Tree.Beverages, Tree.Condiments};
        System.out.println("Tree of Hierarchy");
        System.out.println("Food");
        System.out.println("|");
        for(int i = 0; i < food.length; i++){
            System.out.println("|--" + FoodCategories[i]);
            for(int j = 0; j < food[i].length; j++)
            System.out.println("|  |--" + food[i][j]);
        }
    }
}