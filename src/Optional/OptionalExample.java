package Optional;

import java.util.Optional;

public class OptionalExample {

    private static Optional<String> getName(int id){
//        String name = "Max";
        String name = null;
        return Optional.ofNullable(name); // return object of name
    }
    public static void main(String[] args) {
       Optional<String> name = getName(1); // optional object, name may be null
        String nameToBeUsed = name.orElse("NA");
        System.out.println(nameToBeUsed);
        if(name.isPresent()){
            System.out.println(name.get().toUpperCase());
        }
        name.ifPresent(x-> System.out.println("Name is " + x));
    }
}
