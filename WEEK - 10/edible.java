package week_10;

class Edible{
    static class Fruit {
        static void fruitDetails() {
            System.out.println("Fruit: Apple, rich in vitamins and fiber.");
        }
        
        void fruitPackaging() {
            System.out.println("Fruit Packaging: Apples packed in foam nets and boxes.");
        }
    }
    
    static class Vegetable {
        static void vegetableDetails() {
            System.out.println("Vegetable: Carrot, a good source of beta-carotene.");
        }

        void vegetablePackaging() {
            System.out.println("Vegetable Packaging: Carrots packed in plastic wraps.");
        }
    }

    public static void main(String[] args) {
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegetableDetails();

        Edible.Fruit fruitObj = new Edible.Fruit();
        fruitObj.fruitPackaging();

        Edible.Vegetable vegObj = new Edible.Vegetable();
        vegObj.vegetablePackaging();
    }
}
