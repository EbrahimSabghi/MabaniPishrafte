public class MashinTest {

    class Mashin {

        // Dade :
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        double toul;
        double arz;
        String mark;

        // Tabe (Methods)
        void roshan() {
            System.out.println("Mashin rooshan ast!");
            ayaMashinRoshanAst = true;
        }

        void  khamoosh() {
            System.out.println("Mashin khamoosh ast!");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar() {
            System.out.println("Dar baz ast!");
            ayaDarMashinBazAst = true;
        }

        void bastanDar() {
            System.out.println("Dar baste ast!");
            ayaDarMashinBazAst = false;
        }

        void harekat() {
            // dar basteh bashad va mashin roohan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("Mashin dar hale harekat ast");
            } else {
                System.out.println("Mashin park ast!");
            }


        }







    } //end of class Mashin






} //end of class MashinTest
