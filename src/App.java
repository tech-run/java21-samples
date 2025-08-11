public class App {

    private String name; 
    
    App(String name){
        this.name = name;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(App.formatter("args"));
        System.out.println(App.formatter(1234));
        System.out.println(App.formatter(null));
        System.out.println(App.formatter(new App("23")));
    }

    static String formatter(Object obj) {
    return switch (obj) {
        case Integer i -> "int: " + i;
        case String s -> "string: " + s;
        case null -> "null";
        default -> "unknown";
    };
}
}
