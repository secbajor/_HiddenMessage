
public class HiddenMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * “HIDDEN MESSAGE” Class example! Write a long, 
		 * convoluted list of letters on the whiteboard.
		 * Have the kids type the letters in a String variable 
		 * as you write it so that they all have it at the same time.
		 * Within the jumble, have letters that spell out 
		 * “I LOVE iD TECH” (put some capital I’s in there to mess 
		 * them up!). Give a ticket to the first person to use 
		 * concatenation, length(), charAt(), indexOf(), and 
		 * .substring to print out the hidden message! 
		 * 
		 * WINNER RECEIVES: One winner certificate and a ticket 
		 */
		
		String hid = "DKIDCLDKOJJMEVEMIIiFNDNCBTJECOSPAPSMH"; 
		System.out.println(hid.charAt(hid.indexOf('I')));
		System.out.println(hid.charAt(hid.indexOf('L')));
		System.out.println(hid.charAt(hid.indexOf('O')));
		System.out.println(hid.charAt(hid.indexOf('V')));
		System.out.println(hid.charAt(hid.indexOf('E')));
		System.out.println(hid.charAt(hid.indexOf('i')));
		System.out.println(hid.charAt(hid.indexOf('D')));
		System.out.println(hid.charAt(hid.indexOf('T')));
		System.out.println(hid.charAt(hid.indexOf('E')));
		System.out.println(hid.charAt(hid.indexOf('C')));
		System.out.println(hid.charAt(hid.indexOf('H')));

	}

}
