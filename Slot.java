/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author 1146355
 */
public class Slot {
    
    private int dia;
    private int horario;
    private String descHora;
    private Musica musica;
    
    

    /**
     * @return the dia
     */
    
    public Slot(int dia, int horario, Musica musica) {
    	
    	this.dia = dia;
    	this.horario = horario;
    	this.musica = musica;
    	
    	
    	
    	if(horario == 1) {
    		this.descHora = "00:00";
    	}
    	else if(horario == 2) {
    		this.descHora = "00:05";
    	}
    	else if(horario == 3) { 
    		this.descHora = "00:10";
    	}
    	else if(horario == 4) {
    		this.descHora = "00:15";
    	}
    	else if(horario == 5) {
    		this.descHora = "00:20";
    	}
    	else if(horario == 6) {
    		this.descHora = "00:25";
    	}
    	else if(horario == 7) {
    		this.descHora = "00:30";
    	}
    	else if(horario == 8) {
    		this.descHora = "00:35";
    	}
    	else if (horario == 9) { 
           this.descHora = "00:40";
        }
        else if (horario == 10) { 
           this.descHora = "00:45";
        }
          else if (horario == 11) { 
            this.descHora = "00:50";
           }
          else if (horario == 12) { 
            this.descHora = "00:55";
          }
          else if (horario == 13) { 
            this.descHora = "01:00";
          }
          else if (horario == 14) { 
            this.descHora = "01:05";
          }
          else if (horario == 15) { 
            this.descHora = "01:10";
          }
          else if (horario == 16) { 
            this.descHora = "01:15";
          }
          else if (horario == 17) { 
            this.descHora = "01:20";
          } 
          else if (horario == 18) { 
            this.descHora = "01:25";
          }
           else if (horario == 19) { 
            this.descHora = "01:30";
          }
          else if (horario == 20) { 
            this.descHora = "01:35";
          }
          else if (horario == 21) { 
            this.descHora = "01:40";
          }
          else if (horario == 22) { 
            this.descHora = "01:45";
          }
          else if (horario == 23) { 
            this.descHora = "01:50";
          }
          else if (horario == 24) { 
            this.descHora = "01:55";
          }
          else if (horario == 25) { 
            this.descHora = "02:00";
          }
          else if (horario == 26) { 
            this.descHora = "02:05";
          } 
          else if (horario == 27) { 
            this.descHora = "02:10";
          }
           else if (horario == 28) { 
            this.descHora = "02:15";
          }
          else if (horario == 29) { 
            this.descHora = "02:20";
           }
          else if (horario == 30) { 
            this.descHora = "02:25";
          }
          else if (horario == 31) { 
            this.descHora = "02:30";
          }
          else if (horario == 32) { 
            this.descHora = "02:35";
          }
          else if (horario == 33) { 
            this.descHora = "02:40";
          }
          else if (horario == 34) { 
            this.descHora = "02:45";
          }
          else if (horario == 35) { 
            this.descHora = "02:50";
          } 
          else if (horario == 36) { 
            this.descHora = "02:55";
          }
           else if (horario == 37) { 
            this.descHora = "03:00";
          }
          else if (horario == 38) { 
            this.descHora = "03:05";
           }
          else if (horario == 39) { 
            this.descHora = "03:10";
          }
          else if (horario == 40) { 
            this.descHora = "03:15";
          }
          else if (horario == 41) { 
            this.descHora = "03:20";
          }
          else if (horario == 42) { 
            this.descHora = "03:25";
          }
          else if (horario == 43) { 
            this.descHora = "03:30";
          }
          else if (horario == 44) { 
            this.descHora = "03:35";
            } 
          else if (horario == 45) { 
            this.descHora = "03:40";
          }
           else if (horario == 46) { 
            this.descHora = "03:45";
          }
          else if (horario == 47) { 
            this.descHora = "03:50";
           }
          else if (horario == 48) { 
            this.descHora = "03:55";
          }
          else if (horario == 49) { 
            this.descHora = "04:00";
          }
          else if (horario == 50) { 
            this.descHora = "04:05";
          }
          else if (horario == 51) { 
            this.descHora = "04:10";
          }
          else if (horario == 52) { 
              this.descHora = "04:15";
            }
            else if (horario == 53) { 
              this.descHora = "04:20";
            } 
            else if (horario == 54) { 
              this.descHora = "04:25";
            }
             else if (horario == 55) { 
              this.descHora = "04:30";
            }
            else if (horario == 56) { 
              this.descHora = "04:35";
            }
            else if (horario == 57) { 
              this.descHora = "04:40";
            }
            else if (horario == 58) { 
              this.descHora = "04:45";
            }
            else if (horario == 59) { 
              this.descHora = "04:50";
            }
            else if (horario == 60) { 
              this.descHora = "04:55";
            }
            else if (horario == 61) { 
              this.descHora = "05:00";
            }
            else if (horario == 62) { 
              this.descHora = "05:05";
            } 
            else if (horario == 63) { 
              this.descHora = "05:10";
            }
             else if (horario == 64) { 
              this.descHora = "05:15";
            }
            else if (horario == 65) { 
              this.descHora = "05:20";
             }
            else if (horario == 66) { 
              this.descHora = "05:25";
            }
            else if (horario == 67) { 
              this.descHora = "05:30";
            }
            else if (horario == 68) { 
              this.descHora = "05:35";
            }
            else if (horario == 69) { 
              this.descHora = "05:40";
            }
            else if (horario == 70) { 
              this.descHora = "05:45";
            }
            else if (horario == 71) { 
              this.descHora = "05:50";
            } 
            else if (horario == 72) { 
              this.descHora = "05:55";
            }
             else if (horario == 73) { 
              this.descHora = "06:00";
            }
            else if (horario == 74) { 
              this.descHora = "06:05";
             }
            else if (horario == 75) { 
              this.descHora = "06:10";
            }
            else if (horario == 76) { 
              this.descHora = "06:15";
            }
            else if (horario == 77) { 
              this.descHora = "06:20";
            }
            else if (horario == 78) { 
              this.descHora = "06:25";
            }
            else if (horario == 79) { 
              this.descHora = "06:30";
            }
            else if (horario == 80) { 
              this.descHora = "06:35";
              } 
            else if (horario == 81) { 
              this.descHora = "06:40";
            }
             else if (horario == 82) { 
              this.descHora = "06:45";
            }
            else if (horario == 83) { 
              this.descHora = "06:50";
             }
            else if (horario == 84) { 
              this.descHora = "06:55";
            }
            else if (horario == 85) { 
              this.descHora = "07:00";
            }
            else if (horario == 86) { 
              this.descHora = "07:05";
            }
            else if (horario == 87) { 
              this.descHora = "07:10";
            }
            else if (horario == 88) { 
              this.descHora = "07:15";
            }
            else if (horario == 89) { 
              this.descHora = "07:20";
            } 
            else if (horario == 90) { 
              this.descHora = "07:25";
            }
             else if (horario == 91) { 
              this.descHora = "07:30";
            }
            else if (horario == 92) { 
              this.descHora = "07:35";
             }
            else if (horario == 93) { 
              this.descHora = "07:40";
            }
            else if (horario == 94) { 
              this.descHora = "07:45";
            }
            else if (horario == 95) { 
              this.descHora = "07:50";
            }
            else if (horario == 96) { 
              this.descHora = "07:55";
            }
            else if (horario == 97) { 
              this.descHora = "08:00";
            }
            else if (horario == 98) { 
              this.descHora = "08:05";
            } 
            else if (horario == 99) { 
              this.descHora = "08:10";
            }
             else if (horario == 100) { 
              this.descHora = "08:15";
            }
            else if (horario == 101) { 
              this.descHora = "08:20";
             }
            else if (horario == 102) { 
              this.descHora = "08:25";
            }
            else if (horario == 103) { 
              this.descHora = "08:30";
            }
            else if (horario == 104) { 
              this.descHora = "08:35";
            }
            else if (horario == 105) { 
              this.descHora = "08:40";
            }
            else if (horario == 106) { 
              this.descHora = "08:45";
            }
            else if (horario == 107) { 
              this.descHora = "08:50";
            } 
            else if (horario == 108) { 
              this.descHora = "08:55";
            }
             else if (horario == 109) { 
              this.descHora = "09:00";
            }
            else if (horario == 110) { 
              this.descHora = "09:05";
             }
            else if (horario == 111) { 
              this.descHora = "09:10";
            }
            else if (horario == 112) { 
              this.descHora = "09:15";
            }
            else if (horario == 113) { 
              this.descHora = "09:20";
            }
            else if (horario == 114) { 
              this.descHora = "09:25";
            }
            else if (horario == 115) { 
              this.descHora = "09:30";
            }
            else if (horario == 116) { 
              this.descHora = "09:35";
              } 
            else if (horario == 117) { 
              this.descHora = "09:40";
            }
             else if (horario == 118) { 
              this.descHora = "09:45";
            }
            else if (horario == 119) { 
              this.descHora = "09:50";
             }
            else if (horario == 120) { 
              this.descHora = "09:55";
            }
            else if (horario == 121) { 
              this.descHora = "10:00";
            }
            else if (horario == 122) { 
              this.descHora = "04:05";
            }
            else if (horario == 123) { 
              this.descHora = "10:10";
            }
            else if (horario == 124) { 
              this.descHora = "10:15";
            }
            else if (horario == 125) { 
              this.descHora = "10:20";
            } 
            else if (horario == 126) { 
              this.descHora = "10:25";
            }
             else if (horario == 127) { 
              this.descHora = "10:30";
            }
            else if (horario == 128) { 
              this.descHora = "10:35";
             }
            else if (horario == 129) { 
              this.descHora = "10:40";
            }
            else if (horario == 130) { 
              this.descHora = "10:45";
            }
            else if (horario == 131) { 
              this.descHora = "10:50";
            }
            else if (horario == 132) { 
              this.descHora = "10:55";
            }
            else if (horario == 133) { 
              this.descHora = "11:00";
            }
            else if (horario == 134) { 
              this.descHora = "11:05";
            } 
            else if (horario == 135) { 
              this.descHora = "11:10";
            }
             else if (horario == 136) { 
              this.descHora = "11:15";
            }
            else if (horario == 137) { 
              this.descHora = "11:20";
             }
            else if (horario == 138) { 
              this.descHora = "11:25";
            }
            else if (horario == 139) { 
              this.descHora = "11:30";
            }
            else if (horario == 140) { 
              this.descHora = "11:35";
            }
            else if (horario == 141) { 
              this.descHora = "11:40";
            }
            else if (horario == 142) { 
              this.descHora = "11:45";
            }
            else if (horario == 143) { 
              this.descHora = "11:50";
            } 
            else if (horario == 144) { 
              this.descHora = "11:55";
            }
             else if (horario == 145) { 
              this.descHora = "12:00";
            }
            else if (horario == 146) { 
              this.descHora = "12:05";
             }
            else if (horario == 147) { 
              this.descHora = "12:10";
            }
            else if (horario == 148) { 
              this.descHora = "12:15";
            }
            else if (horario == 149) { 
              this.descHora = "12:20";
            }
            else if (horario == 150) { 
              this.descHora = "12:25";
            }
            else if (horario == 151) { 
              this.descHora = "12:30";
            }
            else if (horario == 152) { 
              this.descHora = "12:35";
              }
            else if (horario == 153) { 
              this.descHora = "12:40";
            } 
            else if (horario == 154) { 
              this.descHora = "12:45";
            }
             else if (horario == 155) { 
              this.descHora = "12:50";
            }
            else if (horario == 156) { 
              this.descHora = "12:55";
             }
            else if (horario == 157) { 
              this.descHora = "13:00";
            }
            else if (horario == 158) { 
              this.descHora = "13:05";
            }
            else if (horario == 159) { 
              this.descHora = "13:10";
            }
            else if (horario == 160) { 
              this.descHora = "13:15";
            }
            else if (horario == 161) { 
              this.descHora = "13:20";
            }
            else if (horario == 162) { 
              this.descHora = "13:25";
            } 
            else if (horario == 163) { 
              this.descHora = "13:30";
            }
             else if (horario == 164) { 
              this.descHora = "13:35";
            }
            else if (horario == 165) { 
              this.descHora = "13:40";
             }
            else if (horario == 166) { 
              this.descHora = "13:45";
            }
            else if (horario == 167) { 
              this.descHora = "13:50";
            }
            else if (horario == 168) { 
              this.descHora = "13:55";
            }
          else if (horario == 169) { 
              this.descHora = "14:00";
            }
            else if (horario == 170) { 
              this.descHora = "14:05";
            }
            else if (horario == 171) { 
              this.descHora = "14:10";
            }
            else if (horario == 172) { 
              this.descHora = "14:15";
            }
            else if (horario == 173) { 
              this.descHora = "14:20";
            }
            else if (horario == 174) { 
              this.descHora = "14:25";
            }
            else if (horario == 175) { 
              this.descHora = "14:30";
            }
            else if (horario == 176) { 
              this.descHora = "14:35";
            }
            else if (horario == 177) { 
              this.descHora = "14:40";
            }
            else if (horario == 178) { 
              this.descHora = "14:45";
            }
            else if (horario == 179) { 
              this.descHora = "14:50";
            }
            else if (horario == 180) { 
              this.descHora = "14:55";
            }
            else if (horario == 181) { 
              this.descHora = "15:00";
            }
            else if (horario == 182) { 
              this.descHora = "15:05";
            }
            else if (horario == 183) { 
              this.descHora = "15:10";
            }
            else if (horario == 184) { 
              this.descHora = "15:15";
            }
            else if (horario == 185) { 
              this.descHora = "15:20";
            }
            else if (horario == 186) { 
              this.descHora = "15:25";
            }
            else if (horario == 187) { 
              this.descHora = "15:30";
            }
            else if (horario == 188) { 
              this.descHora = "15:35";
            }
            else if (horario == 189) { 
              this.descHora = "15:40";
            }
            else if (horario == 190) { 
              this.descHora = "15:45";
            }
            else if (horario == 191) { 
              this.descHora = "15:50";
            }
            else if (horario == 192) { 
              this.descHora = "15:55";
            }
            else if (horario == 193) { 
              this.descHora = "16:00";
            }
            else if (horario == 194) { 
              this.descHora = "16:05";
            }
            else if (horario == 195) { 
              this.descHora = "16:10";
            }
            else if (horario == 196) { 
              this.descHora = "16:15";
            }
            else if (horario == 197) { 
              this.descHora = "16:20";
            }
            else if (horario == 198) { 
              this.descHora = "16:25";
            }
            else if (horario == 199) { 
              this.descHora = "16:30";
            }
            else if (horario == 200) { 
              this.descHora = "16:35";
            }
            else if (horario == 201) { 
              this.descHora = "16:40";
            }
            else if (horario == 202) { 
              this.descHora = "16:45";
            }
            else if (horario == 203) { 
              this.descHora = "16:50";
            }
            else if (horario == 204) { 
              this.descHora = "16:55";
            }
            else if (horario == 205) { 
              this.descHora = "17:00";
            }
            else if (horario == 206) { 
              this.descHora = "17:05";
            }
            else if (horario == 207) { 
              this.descHora = "17:10";
            }
            else if (horario == 208) { 
              this.descHora = "17:15";
            }
            else if (horario == 209) { 
              this.descHora = "17:20";
            }
            else if (horario == 210) { 
              this.descHora = "17:25";
            }
            else if (horario == 211) { 
              this.descHora = "17:30";
            }
            else if (horario == 212) { 
              this.descHora = "17:35";
            }
            else if (horario == 213) { 
              this.descHora = "17:40";
            }
            else if (horario == 214) { 
              this.descHora = "17:45";
            }
            else if (horario == 215) { 
              this.descHora = "17:50";
            }
            else if (horario == 216) { 
              this.descHora = "17:55";
            }
            else if (horario == 217) { 
              this.descHora = "18:00";
            }
            else if (horario == 218) { 
              this.descHora = "18:05";
            }
            else if (horario == 219) { 
              this.descHora = "18:10";
            }
            else if (horario == 220) { 
              this.descHora = "18:15";
            }
            else if (horario == 221) { 
              this.descHora = "18:20";
            }
            else if (horario == 222) { 
              this.descHora = "18:25";
            }
            else if (horario == 223) { 
              this.descHora = "18:30";
            }
            else if (horario == 224) { 
              this.descHora = "18:35";
            }
            else if (horario == 225) { 
              this.descHora = "18:40";
            }
            else if (horario == 226) { 
              this.descHora = "18:45";
            }
            else if (horario == 227) { 
              this.descHora = "18:50";
            }
            else if (horario == 228) { 
              this.descHora = "18:55";
            }
            else if (horario == 229) { 
              this.descHora = "19:00";
            }
            else if (horario == 230) { 
              this.descHora = "19:05";
            }
            else if (horario == 231) { 
              this.descHora = "19:10";
            }
            else if (horario == 232) { 
              this.descHora = "19:15";
            }
            else if (horario == 233) { 
              this.descHora = "19:20";
            }
            else if (horario == 234) { 
              this.descHora = "19:25";
            }
            else if (horario == 235) { 
              this.descHora = "19:30";
            }
            else if (horario == 236) { 
              this.descHora = "19:35";
            }
            else if (horario == 237) { 
              this.descHora = "19:40";
            }
            else if (horario == 238) { 
              this.descHora = "19:45";
            }
            else if (horario == 239) { 
              this.descHora = "19:50";
            }
            else if (horario == 240) { 
              this.descHora = "19:55";
            }
            else if (horario == 241) { 
              this.descHora = "20:00";
            }
            else if (horario == 242) { 
              this.descHora = "20:05";
            }
            else if (horario == 243) { 
              this.descHora = "20:10";
            }
            else if (horario == 244) { 
              this.descHora = "20:15";
            }
            else if (horario == 245) { 
              this.descHora = "20:20";
            }
            else if (horario == 246) { 
              this.descHora = "20:25";
            }
            else if (horario == 247) { 
              this.descHora = "20:30";
            }
            else if (horario == 248) { 
              this.descHora = "20:35";
            }
            else if (horario == 249) { 
              this.descHora = "20:40";
            }
            else if (horario == 250) { 
              this.descHora = "20:45";
            }
            else if (horario == 251) { 
              this.descHora = "20:50";
            }
            else if (horario == 252) { 
              this.descHora = "20:55";
            }
            else if (horario == 253) { 
              this.descHora = "21:00";
            }
            else if (horario == 254) { 
              this.descHora = "21:05";
            }
            else if (horario == 255) { 
              this.descHora = "21:10";
            }
            else if (horario == 256) { 
              this.descHora = "21:15";
            }
            else if (horario == 257) { 
              this.descHora = "21:20";
            }
            else if (horario == 258) { 
              this.descHora = "21:25";
            }
            else if (horario == 259) { 
              this.descHora = "21:30";
            }
            else if (horario == 260) { 
              this.descHora = "21:35";
            }
            else if (horario == 261) { 
              this.descHora = "21:40";
            }
            else if (horario == 262) { 
              this.descHora = "21:45";
            }
            else if (horario == 263) { 
              this.descHora = "21:50";
            }
            else if (horario == 264) { 
              this.descHora = "21:55";
            }
            else if (horario == 265) { 
              this.descHora = "22:00";
            }
            else if (horario == 266) { 
              this.descHora = "22:05";
            }
            else if (horario == 267) { 
              this.descHora = "22:10";
            }
            else if (horario == 268) { 
              this.descHora = "22:15";
            }
            else if (horario == 269) { 
              this.descHora = "22:20";
            }
            else if (horario == 270) { 
              this.descHora = "22:25";
            }
            else if (horario == 271) { 
              this.descHora = "22:30";
            }
            else if (horario == 272) { 
              this.descHora = "22:35";
            }
            else if (horario == 273) { 
              this.descHora = "22:40";
            }
            else if (horario == 274) { 
              this.descHora = "22:45";
            }
            else if (horario == 275) { 
              this.descHora = "22:50";
            }
            else if (horario == 276) { 
              this.descHora = "22:55";
            }
            else if (horario == 277) { 
              this.descHora = "23:00";
            }
            else if (horario == 278) { 
              this.descHora = "23:05";
            }
            else if (horario == 279) { 
              this.descHora = "23:10";
            }
            else if (horario == 280) { 
              this.descHora = "23:15";
            }
            else if (horario == 281) { 
              this.descHora = "23:20";
            }
            else if (horario == 282) { 
              this.descHora = "23:25";
            }
            else if (horario == 283) { 
              this.descHora = "23:30";
            }
            else if (horario == 284) { 
              this.descHora = "23:35";
            }
            else if (horario == 285) { 
              this.descHora = "23:40";
            }
            else if (horario == 286) { 
              this.descHora = "23:45";
            }
            else if (horario == 287) { 
              this.descHora = "23:50";
            }
            else if (horario == 288) { 
              this.descHora = "23:55";
            }
    }
    
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the horario
     */
    public int getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * @return the musica
     */
    public Musica getMusica() {
        return musica;
    }

    /**
     * @param musica the musica to set
     */
    public void setMusica(Musica musica) {
        this.musica = musica;
    }
    
    public String getDescHora() {
    	
    	return descHora;
    }
    
    
    
    public String dscrição(){
    	
    	return getDescHora() + " " + getMusica().getNome() + " " + getMusica().getNomeArtista();
    	
    }
}
