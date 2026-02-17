import java.lang.reflect.Method;
import java.lang.annotation.*;

class L5P3{
    @Bullet(str="Dinesh",dbl=17.777)
    public static void anyMethod() throws NoSuchMethodException{
        Method mtd = L5P3.class.getMethod("anyMethod");
        Bullet b = mtd.getAnnotation(Bullet.class);
        System.out.println("String..."+b.str());
        System.out.println("Double..."+b.dbl());
    }
    public static void main(String... args) throws NoSuchMethodException{
        anyMethod();
        
    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)


@interface Bullet{
    String str();
    double dbl();
}
