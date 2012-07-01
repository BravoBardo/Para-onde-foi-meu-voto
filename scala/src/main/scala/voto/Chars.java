package voto;

public class Chars {

  public static String limpa(final String entrada) {

    if (entrada == null) {
      return null;
    }

    StringBuffer result = new StringBuffer();

    for (char c : entrada.toCharArray()) {
      result.append(charLimpo(c));
    }

    return result.toString();
  }

  private static String charLimpo(final char c) {
    switch (c) {
    case ' ':
      return "";
    case '�':
      return "a";
    case '�':
      return "a";
    case '�':
      return "a";
    case '�':
      return "a";
    case '�':
      return "a";
    case '�':
      return "a";
    case '�':
      return "a";
    case '�':
      return "A";
    case '�':
      return "A";
    case '�':
      return "A";
    case '�':
      return "A";
    case '�':
      return "A";
    case '�':
      return "A";
    case '�':
      return "e";
    case '�':
      return "e";
    case '�':
      return "e";
    case '�':
      return "e";
    case '�':
      return "E";
    case '�':
      return "E";
    case '�':
      return "E";
    case '�':
      return "E";
    case '�':
      return "i";
    case '�':
      return "i";
    case '�':
      return "i";
    case '�':
      return "i";
    case '�':
      return "I";
    case '�':
      return "I";
    case '�':
      return "I";
    case '�':
      return "I";
    case '�':
      return "o";
    case '�':
      return "o";
    case '�':
      return "o";
    case '�':
      return "o";
    case '�':
      return "o";
    case '�':
      return "o";
    case '�':
      return "o";
    case '�':
      return "O";
    case '�':
      return "O";
    case '�':
      return "O";
    case '�':
      return "O";
    case '�':
      return "O";
    case '�':
      return "O";
    case '�':
      return "u";
    case '�':
      return "u";
    case '�':
      return "u";
    case '�':
      return "u";
    case '�':
      return "u";
    case '�':
      return "U";
    case '�':
      return "U";
    case '�':
      return "U";
    case '�':
      return "U";
    case '�':
      return "ae";
    case '�':
      return "Ae";
    case '�':
      return "ss";
    case '�':
      return "c";
    case '�':
      return "c";
    case '�':
      return "C";
    case '�':
      return "D";
    case '�':
      return "d";
    case '�':
      return "n";
    case '�':
      return "N";
    case '�':
      return "P";
    case '�':
      return "p";
    case '�':
      return "y";
    case '�':
      return "y";
    case '�':
      return "Y";
    case '(':
      return "";
    case '-':
      return "";
    case ')':
      return "";
    case '�':
      return "1";
    case '�':
      return "2";
    case '�':
      return "3";
    default:
      return "" + c;
    }
  }
}
