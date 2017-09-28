package pastel;
/**
 *
 * @author Dylan Josel Vaca Méndez
 * @version 1.0
 */
public class pastelito {
    int harina, huevos, leche, azucar, betun, polhor;
    
    public void receta(){
        
    }
    
    public void preparar(){
        
    }
    
    public void presentar(){
        
    }
    /**
     * @param flour cantidad de harina necesaria para el pastel
     * @param egg cantidad de huevos necesarios para el pastel
     * @param milk cantidad de leche necesaria para el pastel
     * @param sugar cantidad de azucar necesaria para el pastel
     * @param frosting cantidad de betún necesario para el pastel
     * @param bp cantidad de polvo para hornear necesario para el pastel
     */
    pastelito(int flour, int egg, int milk, int sugar, int frosting, int bp){
        harina = flour;
        huevos = egg;
        leche = milk;
        azucar = sugar;
        betun = frosting;
        polhor = bp;
    }
    
    /**
     * @param frosting cantidad de betún necesario para el pastel
     */
    pastelito(int frosting){
        betun = frosting;
    }
    
    pastelito (){
        
    }
    
    /**
     * @param egg cantidad de huevos necesarios para el pastel
     * @param milk cantidad de leche necesaria para el pastel
     */
    pastelito (int egg, int milk){
        huevos = egg;
        leche = milk;
    }
    
    /**
     * @param flour cantidad de harina necesaria para el pastel
     * @param sugar cantidad de azucar necesaria para el pastel
     * @param bp cantidad de polvo para hornear necesario para el pastel
     */
    pastelito(int flour, int sugar, int bp){
        harina = flour;
        azucar = sugar;
        polhor = bp;
    }
}
