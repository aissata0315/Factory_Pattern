public class FormeFactory {

    // utiliser la methode getForme pour avoir un objet de type forme
    public static IForme getForme(String formeType){
        if(formeType == null){
            return null;
        }
        if(formeType.equalsIgnoreCase("CERCLE")){
            return new Cercle();

        } else if(formeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(formeType.equalsIgnoreCase("CARRE")){
            return new Carré();
        }

        return null;
    }
}
