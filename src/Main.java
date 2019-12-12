import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args){
        String s = new Scanner(System.in).nextLine();
        Arrays.stream(s.split("")).collect(groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().forEach(e-> System.out.print(e.getKey()+""+e.getValue()));
    }
}
