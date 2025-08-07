import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {


    @Test
    void Mashin_Bayad_Harekat_Konad_Vagti_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {

        // Given
        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Volvo");

        // When
        boolean ayaHarekatMikonad = benz.AyaMashinDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVoloHarekarMikonad = volvo.AyaMashinDarHaleHarekatAst();


        // Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVoloHarekarMikonad);



    }
//        Mashin mashin1 = new Mashin();
//        mashin1.bazKardanDar();
////        mashin1.bastanDar();
//
//        System.out.println("Aya dare mashin baz ast? " + mashin1.ayaDarMashinBazAst);
//
//        Mashin bmw = new Mashin("BMW");
//        bmw.bazKardanDar();
//
//        System.out.println("Aya dare mashin baz ast? " + bmw.ayaDarMashinBazAst);
//    }
//




    class Mashin {


        // ##### Constructor:

        Mashin() {
            out.println("Yek Mashin Bedoone Dade Sakhte Shod!");
        }

        Mashin(String mark) {
            this.mark = mark;
            out.println("Yek mashine " + mark + " sakhte shod");
        }


        // ##### Dade :
        boolean ayaMashinRoshanAst; // default=false
        boolean ayaDarMashinBazAst; // default=false
        // double toul;
        // double arz;
        String mark;

        // ##### Tabe (Methods)
        void roshan() {
            out.println("Mashin rooshan ast!");
            ayaMashinRoshanAst = true;
        }

        void  khamoosh() {
            out.println("Mashin khamoosh ast!");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar() {
            out.println("Dar baz ast!");
            ayaDarMashinBazAst = true;
        }

        void bastanDar() {
            out.println("Dar baste ast!");
            ayaDarMashinBazAst = false;
        }

        boolean AyaMashinDarHaleHarekatAst() {
            // dar basteh bashad va mashin roohan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst){
                out.println("Mashin dar hale harekat ast");
                return true;
            } else {
                out.println("Mashin park ast!");
                return false;
            }


        }







    } //end of class Mashin






} //end of class MashinTest
