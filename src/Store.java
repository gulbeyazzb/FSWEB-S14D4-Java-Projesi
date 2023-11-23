import com.workintech.monstergame.Monster;
import com.workintech.monstergame.Troll;
import com.workintech.monstergame.Werewolf;
import com.workintech.productforsale.Bread;
import com.workintech.productforsale.Chocolate;
import com.workintech.productforsale.Coke;
import com.workintech.productforsale.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale somonBread=new Bread("Somon",7,"ekmek");
        ProductForSale bugdayBread=new Bread("Tam Buğday",17,"tam buğday unlu ekmek");
        ProductForSale chocolateBitter=new Chocolate("bitter ",7,"bitter çikolata");
        ProductForSale milkChocolate=new Chocolate("sütlü",5,"sütlü çikolata");
        ProductForSale fantaCoke=new Coke("Fanta",27.5,"sarı kola");

        ProductForSale[] products={somonBread,bugdayBread,milkChocolate,chocolateBitter,fantaCoke};

        listProducts(products);

        System.out.println("**************");

        Monster troll=new Troll("Troll",20,80);
        System.out.println(troll.attack());
        Monster wolf=new Werewolf("Wolf",10,50);
        System.out.println(wolf.attack());

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}