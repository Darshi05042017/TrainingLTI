import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lti.traininghib.Food;
import com.lti.traininghib.FoodProducts;

public class FoodTest {

	@Test
	public void test() {

			ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
			
			Food fd = (Food) context.getBean("foodProductImpl");
			FoodProducts fp=new FoodProducts();
						
			fp.setItemName("Chiku");
			fp.setDesc("It's the best of mine.");
			fp.setQuantity(25);
			fd.addNewFood(fp);
			
			}
	@Test
	public void fetch() {

			ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
			
			Food fd = (Food) context.getBean("foodProductImpl");
			FoodProducts cc=new FoodProducts();
						
			List<FoodProducts> list=fd.getFoodDetails();
			for(FoodProducts c : list){
				System.out.println(c.getId());
				System.out.println(c.getItemName());
				System.out.println(c.getDesc());
				System.out.println(c.getQuantity()+"\n\n");
				

			}
			

	}

}
