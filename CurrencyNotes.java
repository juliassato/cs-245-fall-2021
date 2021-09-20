/*
+++++

	notes 0: currency formatting
	julia sato for cs-112 [fall 2021]
	sept 13, 2021

+++++



	+ for more accuracy, we are using the BigDecimal class with
		a formatter. for Lots of Accuracy. 

	Decimal pattern: "$#,##0.00" meaning: 
	
	+ must have dollar sign .   
	+ the 0.00 means print digit if present, else zero. it will also round up. 
	+ the #,##0. part--- the # means put a digit if present. ,##0. prints a comma 
		every three decimal places for proper formatting. 
	

	categories of methods: 
	instance methods - belongs to the object. object must exist
	static method - can be called w no object. belong to class
			System.out.println(); Out is an object, System is the class, println
			the static method. So technically the object referencing a static method.
			Something in here is polymorphic.  

	+ Objects help with encapsulation.  

*/


// Import him!!!!!!!!!!!!!!!!!!!!
import java.text.DecimalFormat;
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

class CurrencyNotes{
	

	public String printDollarAmt(double vibecheck){
		/*
			this is formatting using DecimalFormat. 
		*/ 
		String pattern = "$#,##0.00"
		DecimalFormat dr = new DecimalFormat(pattern);
		return dr.format(vibecheck);

	}

	public String numFormatAmt(double num){ 
		/* 
			this will format for wherever you set your location (installing java)
			NumberFormat is an abstract class. Or something. It inherits
		*/
		return NumberFormat.getCurrencyInstance().format(number);
	}


	/*
		NumberFormat pattern Reference. 

		0	A digit - always displayed, even if number has less digits (then 0 is displayed)
		#	A digit, leading zeroes are omitted.
		.	Marks decimal separator
		,	Marks grouping separator (e.g. thousand separator)
		E	Marks separation of mantissa and exponent for exponential formats.
		;	Separates formats
		-	Marks the negative number prefix
		%	Multiplies by 100 and shows number as percentage
		?	Multiplies by 1000 and shows number as per mille
		¤	Currency sign - replaced by the currency sign for the Locale. Also makes formatting use the monetary decimal separator instead of normal decimal separator. ¤¤ makes formatting use international monetary symbols.
		X	Marks a character to be used in number prefix or suffix
		'	Marks a quote around special characters in prefix or suffix of formatted number.

	source: http://tutorials.jenkov.com/java-internationalization/decimalformat.html

	*/


}
