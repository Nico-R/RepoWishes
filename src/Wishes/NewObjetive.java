package Wishes;
import java.util.Date;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import Wishes.Vence;

/**
 * Created by Nicolas on 09/04/2016.
 */
public class NewObjetive {
    private String objetive;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date actual;
    Vence ven = new Vence();

    public NewObjetive(){System.out.println(actual);}//para probar si muestra fecha actual.

    public String getObjetive() {

        if ( ven.getFecha().after(actual)) {
            System.out.println(objetive); }
        else{
            System.out.println("No ah cumplido con la fecha aún.");
        }

        return null;
    }

    public void setObjetive(String objetive) {
        this.objetive = objetive;
    };





}
