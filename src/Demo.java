public class Demo {
        public static void main(String[] args) {
            //recuperer un object cercle et appeler la methde dessiner
            IForme forme1 = FormeFactory.getForme("CERCLE");

            forme1.dessiner();

            IForme forme2 = FormeFactory.getForme("RECTANGLE");

            forme2.dessiner();

            IForme forme3 = FormeFactory.getForme("CARRE");

            forme3.dessiner();
        }
}
