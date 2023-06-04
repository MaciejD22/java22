package Lekcja1;

public class PriorytetyOperatorów {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 1;

//            0	()	wywołanie funkcji / metody	myFunkcja(par1, par2)
//        11	&&	logiczny iloczynu (AND)	(x==y) && (x==z)
//        12	||	logiczna suma (OR)	(x==y) || (x==z)
        if (x > 0 && (y > 0 || z > 0)) {
//            priorytet możemy zmienić nawiasami!
            System.out.println("warunek spełniony");
        } else {
            System.out.println("Warunek nie spełniony");
        }
    }



    //         PRIORYTET OPERATORÓW
//            0	.	selektor obiektu	MyObiekt.PoleObiektu
//            0	[]	indeks tablicy	myAtray[5]
//            0	()	wywołanie funkcji / metody	myFunkcja(par1, par2)
//            1	++	operator inkrementacji przyrostkowej / przedrostkowej	x++, ++x
//            1	--	operator dekrementacji przyrostkowej / przedrostkowej	x--, --x
//            1	~	operator negacji bitowej	~x
//            1	!	operator negacji logicznej	!x
//            1	instanceof	operator instancji klasy	if (myObiekt instanceof myClass)
//            2	new	operator przydziału pamięci zmiennej	new myZmienna
//            3	*	operator mnożenia	x * y
//            3	/	operator dzielenia	x / y
//            3	%	operator modulo (reszta z dzielenia)	x % y
//            4	+	operator dodawania	x + y
//            4	-	operator odejmowania	x - y
//            5	<<	bitowe przesunięcie w lewo	x << 4
//            5	>>	bitowe przesunięcie w prawo	x >> 3
//            5	>>>	bitowe przesunięcie w prawo z wypełnieniem zerami	x >>> 3
//            6	<	operator mniejszości	x < y
//            6	>	operator większości	x > y
//            6	<=	operator mniejszości lub równości	x <= y
//            6	>=	operator większości lub równości	x >= y
//            7	= =	operator porównania (równości)	x = = y
//            7	!=	operator różności (nierównosci)	x != y
//        8	&	bitowy iloczyn	x & y
//        9	^	bitowa różnicy symetrycznej (XOR)	x ^ y
//        10	|	bitowa suma	x | y
//        11	&&	logiczny iloczynu (AND)	(x==y) && (x==z)
//        12	||	logiczna suma (OR)	(x==y) || (x==z)
//        13	?:	operator if - else	z = (x==y) ? 1 : 0;
//        14	=	przypisanie	x = 5;
}
