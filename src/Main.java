import com.securevault.core.VaultItem;
import com.securevault.specialty.FragileItem;

public class Main {
    static void main() {
		FragileItem vase = new FragileItem("vase",12.75, false);
        VaultItem sword = new VaultItem("Sword",50.50);
        System.out.println("Hello World!");
        System.out.println(sword.toString());
        System.out.println(vase.toString());

    }
}
