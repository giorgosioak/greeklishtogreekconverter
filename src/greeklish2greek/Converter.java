/*
 *  This file is part of Greeklish to Greek Converter.
 * 
 *  Greeklish to Greek Converter is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  Greeklish to Greek Converter is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with Greeklish to Greek Converter.  If not, see <http://www.gnu.org/licenses/>.
 */
package greeklish2greek;

/**
 *
 * @author George Ioakeimidis <giorgosioak95 at gmail.com>
 */
public class Converter {

    public String convertText(String src){
            
        char [] input = src.toCharArray();
        char [] output = new char[input.length];
        
        int j = 0;
        
        for(int i = 0; i < input.length; i++) {
            
            if ( ';' == input[i] ) {
                
                if ( i < input.length-1 ){
                    if ( isVowel(input[i+1]) ){
                        output[j] = convertVowelChar(input[i+1]);
                        i++;
                    } else {
                        output[j] = convertChar(input[i]);
                    }
                }
                
            } else {
                output[j] = convertChar(input[i]);
            }
            j++;
        }
        
        
        String str = new String(output);
        
        return str;
    }
    
    private char convertChar(char c){
        switch( c ) {
            case 'w': return 'ς';
            case 'e': return 'ε';
            case 'r': return 'ρ';
            case 't': return 'τ';
            case 'y': return 'υ';
            case 'u': return 'θ';
            case 'i': return 'ι';
            case 'o': return 'ο';
            case 'p': return 'π';
            case 'a': return 'α';
            case 's': return 'σ';
            case 'd': return 'δ';
            case 'f': return 'φ';
            case 'g': return 'γ';
            case 'h': return 'η';
            case 'j': return 'ξ';
            case 'k': return 'κ';
            case 'l': return 'λ';
            case 'z': return 'ζ';
            case 'x': return 'χ';
            case 'c': return 'ψ';
            case 'v': return 'ω';
            case 'b': return 'β';
            case 'n': return 'ν';
            case 'm': return 'μ';
            
            case 'W': return 'ς';
            case 'E': return 'Ε';
            case 'R': return 'Ρ';
            case 'T': return 'Τ';
            case 'Y': return 'Υ';
            case 'U': return 'Θ';
            case 'I': return 'Ι';
            case 'O': return 'Ο';
            case 'P': return 'Π';
            case 'A': return 'Α';
            case 'S': return 'Σ';
            case 'D': return 'Δ';
            case 'F': return 'Φ';
            case 'G': return 'Γ';
            case 'H': return 'Η';
            case 'J': return 'Ξ';
            case 'K': return 'Κ';
            case 'L': return 'Λ';
            case 'Z': return 'Ζ';
            case 'X': return 'Χ';
            case 'C': return 'Ψ';
            case 'V': return 'Ω';
            case 'B': return 'Β';
            case 'N': return 'Ν';
            case 'M': return 'Μ';
            
            default: return c;
        }
    }

    private char convertVowelChar(char c) {
        switch( c ) {
            case 'v': return 'ώ';
            case 'e': return 'έ';
            case 'y': return 'ύ';
            case 'i': return 'ί';
            case 'o': return 'ό';
            case 'a': return 'ά';
            case 'h': return 'ή';
            
            case 'V': return 'Ώ';
            case 'E': return 'Έ';
            case 'Y': return 'Ύ';
            case 'I': return 'Ί';
            case 'O': return 'Ό';
            case 'A': return 'Ά';
            case 'H': return 'Ή';
                        
            default: return c;
        }
    }

    private boolean isVowel(char c) {
        switch ( c ) {
            case 'v':
            case 'e':
            case 'y':
            case 'i':
            case 'o':
            case 'a':
            case 'h':
            case 'V':
            case 'E':
            case 'Y':
            case 'I':
            case 'O':
            case 'A':
            case 'H':    return true;
            default: return false;
        }
    }  
        
    
}
