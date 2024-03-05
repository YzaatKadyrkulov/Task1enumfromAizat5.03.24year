public enum Fruits {
    APPLE("not citrus"),
    BANANA("citrus"),
    ORANGE("not citrus"),
    MANGO("citrus"),
    CRAPES(" citrus"),
    PINEAPPLE("citrus"),
    POMEGRANATE("citrus");

    private String fruit;

    Fruits(String fruit){
        this.fruit = fruit;
    }

    public void getFruits(){
        System.out.println(fruit);
    }

    }

