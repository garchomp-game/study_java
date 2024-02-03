import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Main {

    private String name;
    private int age;

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.setName("John Doe");
        myObj.setAge(30);
        
        // ゲッターを使用してフィールドの値を取得し、出力する
        System.out.println("Name: " + myObj.getName());
        System.out.println("Age: " + myObj.getAge());
        
        // toStringメソッドを使用してオブジェクトの情報を出力する
        System.out.println(myObj);
    }
}
