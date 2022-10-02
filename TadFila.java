package lab;

public class TadFila {
	
	private	Slot[] fila;
	private int inicio;
	private int fim;
	private int TAMANHO;
	private int quantidade;
	
	public TadFila(int tam) {
		fila = new Slot[tam];
		inicio = -1;
		fim = -1;
		TAMANHO = tam;
		quantidade = 0;
	}
	
	public int getTAMANHO() {
		return TAMANHO;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public boolean vazia() {
		return quantidade == 0;
	}
	
	public boolean cheia() {
		return quantidade == TAMANHO;
	}
	
	public String inserir(Slot slot) {
		if(cheia()) {
			return "Fila Cheia!";
		} else {
			if(vazia()) {
				inicio = 0;
				fim = 0;
			} else {
				fim = (fim + 1) % TAMANHO;
			}
			fila[fim] = slot;
			quantidade++;
			return "\t ELemento inserido";
			
		}
	}
	
	public String buscarDia(int dia) {
		
		Artista Matue = new Artista("Matue", "Ceara", "28");
		Artista Teto = new Artista("Teto", "Bahia", "20");
		Artista Wiu = new Artista("WIU", "Ceara", "19");
		Artista Dfideliz = new Artista("Dfideliz", "São Paulo", "23");
		Artista YunkVino = new Artista("Yunk Vino", "São Paulo", "25");
		Artista Derek = new Artista("Derek", "São Paulo", "22");
		Artista KayBlack = new Artista("kayBlack", "São Paulo", "21");
		Artista JeSant = new Artista("Je Santiago", "São Paulo", "25");
		Artista YungBuda = new Artista("Yung Buda", "São Paulo", "24");
		Artista Travis = new Artista("Travis Scott", "Texas", "31");
		Artista McCaverinha = new Artista("Mc Caverinha", "São Paulo", "14");
		Artista BlackAlien = new Artista("Black Alien", "São Paulo", "40");
		Artista McIgu = new Artista("Mc igu", "São Paulo", "26");
		
		
		Artista DjEry = new Artista("Dj Ery", "São Paulo", "28");
		Artista GBR = new Artista("DJ GBR", "São Paulo", "20");
		Artista Livinho = new Artista("Mc Livinho", "São Paulo", "27");
		Artista McDonJuan = new Artista("Mc Don Juan", "São Paulo", "21");
		Artista SalvadorDaRima = new Artista("Salvador da Rima", "São Paulo", "19");
		Artista Sidoka = new Artista("Sidoka", "Belo Horizonte", "22");
		Artista L7nnon = new Artista("L7nnon", "Rio de Janeiro", "28");
		Artista PozeDoRodo = new Artista("Mc Poze do Rodo", "Rio de Janeiro", "23");
		Artista PostMalone = new Artista("Post Malone", "Nova York", "27");
		Artista JustinBieber = new Artista("Justin Bieber", "Canadá", "28");
		Artista Marshmellow = new Artista("Marshmellow", "Estados Unidos", "30");
		Artista Khalid = new Artista("Khalid", "Estados Unidos", "24");
		Artista BrunoMars = new Artista("Bruno Mars", "Estados Unidos", "36");
		Artista EdSheeran = new Artista("EdSheeran", "Reino Unido", "31");
		Artista Coldplay = new Artista("Coldplay", "Reino Unido", "26");
		Artista ImagineDragons = new Artista("Imagine Dragon", "Estados Unidos", "34");
		Artista SnoopDog = new Artista("Snoop Dogg", "Estados Unidos", "50");
		Artista FrankOcean = new Artista("Frank Ocean", "Estados Unidos", "34");
		Artista ArticMonkeys = new Artista("Artic Monkeys", "Inglaterra", "30");
		Artista Pericles = new Artista("Pérciles", "São Paulo", "53");
		Artista Anitta = new Artista("Anitta", "São Paulo", "29");
		Artista HarryStyle = new Artista("Harry Style", "Reino Unido", "28");
		Artista Zyan = new Artista("Zyan", "Reino Unido", "29");
		Artista ArianaGrande = new Artista("Ariana Grande", "Estados Unidos", "29");
		Artista SelenaGomez = new Artista("Selena Gomez", "Estados Unidos", "30");
		Artista Alok = new Artista("Alok", "Goiânia", "31");
		Artista Avicii = new Artista("Avicii", "Suécia", "29");
		Artista OneRepublic = new Artista("One Republic", "Estados Unidos", "20");
		Artista JorgeMatheus = new Artista("Jorge & Matheus", "Goiás", "17");
		Artista MatheusKaua = new Artista("Matheus & Kaua", "Goiás", "12");
		Artista HenriqueJuliano = new Artista("Henrique & Julaiano", "Tocantins", "14");
		Artista McKevin = new Artista("Mc Kevin", "São Paulo", "23");
		Artista McHariel = new Artista("Mc Hariel", "São Paulo", "24");
		
		
		Artista Mateca = new Artista("Mateca", "São Paulo", "23");
		Artista Japa = new Artista("Japa", "São Paulo", "24");
		Artista MCCabelinho = new Artista("MCCabelinho", "Rio de Janeiro", "25");
		Artista Chefin = new Artista("Chefin", "Rio de Janeiro", "20");
		Artista FilipeRet = new Artista("FilipeRet", "Rio de janeiro", "28");
		Artista DJMattD = new Artista("DJMattD", "São Paulo", "27");
		Artista BIN = new Artista("BIN", "Saõ Paulo", "26");
		Artista Kweller = new Artista("Kweller", "Roraima", "29");
		Artista Alee = new Artista("Alee", "Rio de janeiro", "20");
		
		
		
        //===========================================================================
		
		
		
		Musica Vampiro = new Musica("Vampiro", "2022", Matue );
	      
        Musica SemDo = new Musica("Sem Do", "2021", Matue );
      
        Musica Groupies = new Musica("Groupies", "2021", Matue );
      
        Musica QuerVoar = new Musica("Quer Voar", "2021", Matue );
      
        Musica M4 = new Musica("M4", "2021", Matue );
      
        Musica Banco = new Musica("Banco", "2019", Matue);
                      
        Musica AMorteDoAutotune = new Musica("A Morte do Autotune", "2019", Matue);
                      
        Musica QuemMandaEA30 = new Musica("Quem Manda e a 30", "2018", Matue);
              
        Musica BalAzul = new Musica("Bala Azul", "2022", Teto);
              
        Musica TavaBom = new Musica("Tava Bom", "2022", Mateca);
                       
                
                
                
                
        
        Musica UmaBala = new Musica("Uma Bala", "2018", Derek);
               
        Musica KennyG = new Musica("Kenny G", "2019", Matue);
               
        Musica a777666 = new Musica("777-666", "2020", Matue);
               
        Musica Antes = new Musica("Antes", "2020", Matue);
               
        Musica ESal = new Musica("E Sal", "2020", Matue);
               
        Musica MaquinaDoTempo = new Musica("Maquina Do Tempo", "2020", Matue);
               
        Musica Cogulandia = new Musica("Cogulandia", "2020", Matue);
               
        Musica Manha = new Musica("Manha", "2021", Teto);
               
        Musica DiaAzul = new Musica("Dia Azul", "2021", Teto);
               
        Musica Fashion = new Musica("Fashion", "2021", Teto);
               
        Musica Agua = new Musica("Agua", "2019", Japa);
               
        Musica OkBaby = new Musica("Ok Baby", "2020", Japa);
               
        Musica Rn = new Musica("Rn", "2019", Japa);
               
        Musica Dejavu = new Musica("Dejavu", "2021", Japa);
               
        Musica Osaka = new Musica("Osaka", "2021", Japa);
               
        Musica Kyoto = new Musica("Kyoto", "2021", Japa);
               
        Musica DieForYou = new Musica("Die For You", "2021", Japa);
               
        Musica a2036 = new Musica("2036", "2021", Japa);
               
        Musica High = new Musica("High", "2021", Japa);
               
        Musica SpikeLee = new Musica("Spike Lee", "2021", Japa);
               
        Musica Yokono = new Musica("Yokono", "2021", Japa);
               
        Musica Salao = new Musica("Salao", "2021", Japa);
               
        Musica QuemEQuem = new Musica("Quem E Quem?", "2021", Japa);
               
        Musica Prada = new Musica("Prada", "2021", Japa);
                       
                
                
                
                
                
                
        Musica OCaveiraoChegou = new Musica("O caveirao chegou", "2021", DjEry );
       
        Musica OMaestroDosFluxos = new Musica("Maestro dos FLuxos", "2021", DjEry );
       
        Musica HinoDosParedoes = new Musica("Hino dos Paredoes", "2021", DjEry );
       
        Musica Liberdade = new Musica("Liberdade", "2020", GBR );
       
        Musica MegaRaveSemChao = new Musica("Mega Rave Sem Chao", "2020", GBR );
                       
        Musica RaveDaSirene = new Musica("Rave Da Sirene", "2020", GBR);
               Musica IrmaGostosa = new Musica("Irma Gostosa", "2018", Livinho );
       
        Musica FazerFalta = new Musica("Fazer Falta", "2017", Livinho );
       
        Musica SenteAMarra = new Musica("Sente a Marra", "2017", Livinho );
       
        Musica CalendarioDoPapai = new Musica("Calendária do Papai", "2019", McDonJuan );
       
        Musica ToGostandoTantoDeVoce = new Musica("To Gostando Tanto De Voce", "2018", McDonJuan );
       
        Musica Reputation = new Musica("Reputation", "2022", PostMalone);
                       
                
                
                
                
                
                
                
        
        Musica Felina = new Musica("Felina", "2022", Wiu );
       
        Musica Sertao = new Musica("Sertao", "2022", Wiu );
       
        Musica AmigaTalarica = new Musica("Amiga talarica", "2022", Wiu );
                       
        Musica Pitbull = new Musica("Pitbull", "2021", Wiu);
       
        Musica LagrimasDecrocodilo = new Musica("lagrimas de Crocodilo", "2021", Wiu );
       
        Musica Obraz = new Musica("Obraz", "2020", Wiu );
       
        Musica Mantem = new Musica("Mantem", "2019", Wiu );
                       
        Musica Sucrilhos = new Musica("Sucrilhos", "2019", Wiu);
       
                
                
                
                
                
                
                
                
        Musica DinheiroMeSonda = new Musica("Dinheiro me sonda", "2022", Dfideliz );
       
        Musica Forbes = new Musica("Forbes", "2022", Dfideliz);
               
        Musica ElaRebolaPraMimeSenta = new Musica("Ela Rebola pra Mim e Senta", "2022", Dfideliz );
       
        Musica Marquinha = new Musica("Marquinha", "2022", Dfideliz );
       
        Musica MeninoBom = new Musica("Menino Bom", "2022", Dfideliz );
                       
        Musica EuSoDeslizo = new Musica("Eu so Deslizo", "2021", Dfideliz);
       
        Musica DripdeNegao = new Musica("Drip de Negao", "2021", Dfideliz );
       
        Musica RockNRoll = new Musica("Rock N Roll", "2018", Dfideliz );
       
        Musica PretoRico = new Musica("Preto Rico", "2018", Dfideliz );
                       
        Musica TranseiComAMorte = new Musica("Transei com a Morte", "2019", Dfideliz);
       
        Musica Cassino = new Musica("Cassino", "2019", Dfideliz );
       
        Musica SuaSafada = new Musica("Sua Safada", "2019", Dfideliz);
               
        Musica Oracao = new Musica("Oracao", "2019", Dfideliz );
       
        Musica Progresso = new Musica("Progresso", "2022", Dfideliz );
       
        Musica DizQueEHoje = new Musica("Diz que e Hoje", "2021", Dfideliz );
                       
                
                
                
                
                
                
                
                
                
                
                
                
        Musica MiamiVice = new Musica("Miami Vice", "2022", YunkVino);
       
        Musica Wave = new Musica("Wave", "2022", YunkVino);
       
        Musica Vlife = new Musica("Vlife", "2022", YunkVino);
       
        Musica Margiela = new Musica("margiela", "2021", YunkVino);
                       
        Musica WaterWater = new Musica("Water Water", "2021", YunkVino);
       
        Musica OnlyFans = new Musica("Only Fans", "2021", YunkVino);
       
        Musica Lilas = new Musica("Lilas", "2020", YunkVino);
               
        Musica Highlights = new Musica("Highlights", "2020", YunkVino);
       
        Musica a30Dias = new Musica("30 Dias", "2020", YunkVino);
       
        Musica RSS = new Musica("R.S.S", "2020", YunkVino);
                       
                
                
                
                
                
                
                
        
        Musica LuisaSonza = new Musica("Luisa Sonza", "2022", Derek);
       
        Musica BlackMoney = new Musica("Black Money", "2022", Derek);
       
        Musica ScoobyDoo = new Musica("Scooby Doo", "2022", Derek);
       
        Musica a360 = new Musica("360", "2021", Derek);
                       
        Musica ITOLDYOU = new Musica("I TOLD YOU", "2021", Derek);
       
        Musica ForReal = new Musica("For Real", "2020", Derek);
       
        Musica NoCap = new Musica("No Cap", "2020", Derek);
               
        Musica FeFeFe = new Musica("FeFeFe", "2020", Derek);
       
        Musica EuTenhoDrip = new Musica("Eu Tenho Drip", "2019", Derek);
       
        Musica KylieJenner = new Musica("Kylie Jenner", "2019", Derek);
                       
                
                
                
                
                
                
                
        
        Musica VestidoDaFendi = new Musica("Vestido da Fendi", "2022", KayBlack);
       
        Musica Licor43 = new Musica("Licor 43", "2022", KayBlack);
       
        Musica Lembrancas = new Musica("Lembrancas", "2022", KayBlack);
       
        Musica Tralha = new Musica("Tralha", "2022", KayBlack);
                       
        Musica FogueteDaNasa = new Musica("Foguete da Nasa", "2021", KayBlack);
       
        Musica Freestyle = new Musica("Freestyle", "2022", KayBlack);
       
                
                
                
                
                
                
                
                
                
        Musica OPretoMaiscaro = new Musica("O Preto Mais Caro", "2022", McCaverinha);
               
        Musica DoubleCup = new Musica("Double Cup", "2022", McCaverinha);
       
        Musica Evoque = new Musica("Evoque", "2021", McCaverinha);
       
        Musica a212Vip = new Musica("212 Vip", "2021", McCaverinha);
               
        Musica Flash = new Musica("Flash", "2019", McCaverinha);
                
        Musica Medina = new Musica("Medina", "2019", McCaverinha);
        
        Musica TipoGTA = new Musica("Tipo GTA", "2019", McCaverinha);
        
        Musica NaoPisaNoMeuBoot = new Musica("Nao Pisa no Meu Boot", "2019", McCaverinha);
        
        Musica OPaiTaOn = new Musica("o Pai Ta On", "2021", McCaverinha);
        
        Musica SeSegura = new Musica("Se Segura", "2022", McCaverinha);
        
                
                
                
                
                
                
        
        Musica POCPOC = new Musica("POC POC", "2020", JeSant);
                        
        Musica JackBauer = new Musica("Jack Bauer", "2021", JeSant);
                        
        Musica Honda = new Musica("Honda", "2020", JeSant);
                
        Musica TT = new Musica("TT", "2020", JeSant);
                
        Musica Rush = new Musica("Rush", "2020", JeSant);
                        
        Musica Balenciaga = new Musica("Balenciaga", "2020", JeSant);
                
        Musica LV = new Musica("LV", "2020", JeSant);
                
        Musica Snakes = new Musica("Snakes", "2020", JeSant);
                
        Musica Mob = new Musica("Mob", "2019", JeSant);
                
        Musica NovoRico = new Musica("Novo Rico", "2019", JeSant);
                
        Musica Netflix = new Musica("Netflix", "2017", JeSant);
                
        Musica Dinero = new Musica("Dinero", "2020", JeSant);
                
        Musica VidaDeChafe = new Musica("Vida De Chefe", "2020", JeSant);
                
        Musica TipoGiroflex = new Musica("Tipo Giroflex", "2020", JeSant);
                
        Musica PlayboyInternacional = new Musica("Playboy Internacional", "2020", JeSant);
                        
                
                
                
                
                
        
        Musica Vilao = new Musica("Vilao", "2022", YungBuda);
                
        Musica Monstro = new Musica("Monstro", "2021", YungBuda);
                
        Musica HayabusaChromo = new Musica("Hayabusa Chromo", "2021", YungBuda);
                
        Musica DriftDeYasuo = new Musica("Drift de Yasuo", "2021", YungBuda);
                
        Musica KatanaEPistola = new Musica("Katana E Pistola", "2021", YungBuda);
                
        Musica RidersX = new Musica("Riders X", "2021", YungBuda);
                
        Musica a7K = new Musica("7K", "2019", YungBuda);
                
        Musica NewWave = new Musica("New Wave", "2019", YungBuda);
                
        Musica OSegredoAlemDoJardim = new Musica("O Sergredo Alem do Jardim", "2019", YungBuda);
                
        Musica Ninja = new Musica("Ninja", "2019", YungBuda);
                
        Musica Piloto = new Musica("Piloto", "2019", YungBuda);
                
        Musica Pleasurekreft = new Musica("Pleasurekreft", "2019", YungBuda);
                
        Musica California = new Musica("California", "2019", YungBuda);
                
        Musica AutumnRingMini = new Musica("Autumn Ring Mini", "2019", YungBuda);
                        
        Musica SuzukiEscudo = new Musica("Suziki Escudo", "2019", YungBuda);
        
        Musica Autobahn = new Musica("Autobahn", "2019", YungBuda);
        
        Musica AkatsukiDeVila = new Musica("Akatsuki de Vila", "2017", YungBuda);
        
        Musica JesusChorouPt2 = new Musica("Jesus Chorou Pt II", "2017", YungBuda);
        
        Musica SemSinal = new Musica("Sem Sinal", "2019", YungBuda);
                        
        Musica RejeiteFalsosIcones = new Musica("Rejeito Falsos Icones", "2021", YungBuda);
        
                
                
                
                
                
                
        Musica LouisVMeninaLinda = new Musica("Louis V, Menina Linda", "2021", Sidoka );
        
        Musica NaoMeSintoMAlMais = new Musica("Nao Me SInto MAl MAis", "2019", Sidoka );
        
        Musica EstacionaEDesce = new Musica("Estaciona E Desce", "2019", Sidoka );
        
        Musica AiPreto = new Musica("Ai Preto", "2021", L7nnon );
        
        Musica Perdicao = new Musica("Perdição", "2020", L7nnon );

        Musica SeiQueTuGostaMuito = new Musica("Sei Que Tu Gosta Muito", "2022", L7nnon );
        
        Musica Metflix = new Musica("Metflix", "2022", PozeDoRodo );
        
        Musica MeSintoAbencoado = new Musica("Me Sinto Abençoado", "2021", PozeDoRodo );
        
        Musica ACaraDocrime2 = new Musica("A Cara do Crime 2", "2019", PozeDoRodo );
        
        Musica Congratulation = new Musica("Congratulation", "2016", PostMalone );
        
        Musica  LemonTree = new  Musica ( "Lemon Tree" , "2022" , PostMalone );
                            
        Musica  Stay = new  Musica ( "stay" , "2016" , PostMalone );
                        
        Musica  Circle = new  Musica ( "Circle" , "2019" , PostMalone );
                            
        Musica  CandyPaint = new  Musica ( "Candy Paint" , "2019" , PostMalone );
                            
        Musica  Goodbyes = new  Musica ( "Goodbyes" , "2019" , PostMalone );                            
        Musica  Baby = new  Musica ( "Baby" , "2010" , JustinBieber );
                    
        Musica  OneTime = new  Musica ( "One Time" , "2022" , JustinBieber );
                                
        Musica  Peaches = new  Musica ( "Peaches" , "2021" , JustinBieber );
                        
        Musica  Silence = new  Musica ( "Silence" , "2017" , Marshmellow);
                            
        Musica  Happier = new  Musica ( "Happier" , "2018" , Marshmellow );
                    
        Musica  ComeOn = new  Musica ( "ComeOn" , "2022" , Marshmellow );
                                
        Musica  Better = new  Musica ( "Better" , "2018" , Khalid );
                        
        Musica  Location = new  Musica ( "Location" , "2017" , Khalid );
                            
        Musica  AmericaTeen = new  Musica ( "America Teen" , "2017" , Khalid );
                            
        Musica  Grenade = new  Musica ( "Grenade" , "2010" ,BrunoMars );
                            
        Musica  CountOnMe = new  Musica ( "Count On Me" , "2010" , BrunoMars );
                    
        Musica  MarryYou = new  Musica ( "Marry You" , "2010" , BrunoMars );
                                
        Musica  Photograph = new  Musica ( "Photograph" , "2016" , EdSheeran );
                        
        Musica  ShapeOfYou = new  Musica ( "Shape Of You" , "2017" , EdSheeran );
        Musica Perfect = new  Musica ( "Perfect" , "2017" , EdSheeran );
                    
        Musica  Yellow = new  Musica ( "Yellow" , "2000" , Coldplay );
                                
        Musica  FixYou = new  Musica ( "Fix You" , "2005" , Coldplay );
                        
        Musica  VivaLaVida = new  Musica ( "Viva La Vida" , "2008" , Coldplay );
                            
        Musica  LoveOfMine = new  Musica ( "LoveOfMine" , "2022" , ImagineDragons );                            
        Musica  Beliver = new  Musica ( "Beliver" , "2017" , ImagineDragons );
                            
        Musica  Birds = new  Musica ( "Birds" , "2020" , ImagineDragons );
                    
        Musica  Chanel = new  Musica ( "Chanel" , "2017" , FrankOcean );
                                
        Musica  Nights = new  Musica ( "Nights" , "2017" , FrankOcean );
                        
        Musica  A505 = new  Musica ( "505" , "2007" , ArticMonkeys );
                    
        Musica  JaVirouRotina = new  Musica ( "Ja Virou Rotina" , "2022" , Pericles );
                


                
                
                
                
        Musica Brasa = new  Musica ( "Brasa" , "2022" , Pericles );
                    
        Musica  Lucidez = new  Musica ( "Lucidez" , "2022" , Pericles);
            
        Musica  Envolver = new  Musica ( "Envolver" , "2021" , Anitta );                
        Musica  LaLoto = new  Musica ( "LaLoto" , "2022" , Anitta );
                
        Musica  VersionofMe = new  Musica ( "VersionOfMe" , "2022" , Anitta );                
        Musica  WaterlmelonSugar = new  Musica ( "Watermelon Sugar" , "2021" , HarryStyle );
        
        Musica  AtItWas = new  Musica ( "At It Was" , "2022" , HarryStyle  );
                    
        Musica  Matilda = new  Musica ( "Matilda" , "2022" , HarryStyle  );
            
        Musica  BetterNow = new  Musica ( "Better Now" , "2016" , PostMalone );

        Musica  Psycho = new  Musica ( "Psycho" , "2016" , PostMalone );
        
        Musica  Boyfriend = new  Musica ( "Boyfriend" , "2013" , JustinBieber );
                    
        Musica  Allergic = new  Musica ( "Allergic" , "2019" , PostMalone );
            
        Musica  SaintTropez = new  Musica ( "Saint - Tropez" , "2019" , PostMalone );
                
        Musica  Somebody = new  Musica ( "Somebody" , "2021" , JustinBieber );
                
        Musica  Doutora3 = new  Musica ( "Doutora 3" , "2021" , McKevin );
                
        Musica  CavaloDeTroia = new  Musica ( "Cavalo de Troia" , "2019" , McKevin );
        
        Musica  Cracolandia = new  Musica ( "Cracolândia" , "2019" , McHariel );
                    
        Musica  Sunflower = new  Musica ( "Sunflower" , "2018" , PostMalone );
            
        Musica  internet = new  Musica ( "internet" , "2019" , PostMalone );

        Musica  Enemies = new  Musica ( "Enemies" , "2019" , PostMalone );

        Musica  NeverSayNever = new  Musica ( "Never Say Never" , "2010" , JustinBieber );
        
        Musica  NoisTaBolandoUmPlano = new  Musica ( "Nois Ta Bolando Um Plano" , "2018" , McHariel );
        
        Musica  MacaVerde = new  Musica ( "Maçã Verde" , "2020" , McHariel);
            
        Musica  TiraDeGiro = new  Musica ( "Tira de Giro" , "2018" , McHariel );
    
        Musica  MoBrisa = new  Musica ( "Mo Brisa" , "2017" , McHariel );
        
        Musica  PraTeVer = new  Musica ( "Pra te Ver" , "2019" , McHariel );
                
        Musica  LeiDoRetorno = new  Musica ( "Lei Do Retorno" , "2017" , McHariel );
                
        Musica  Obssessao = new  Musica ( "Obssessão" , "2017" , McHariel );
        
        Musica  QuemTemDo = new  Musica ( "Quem tem Dó" , "2018" , McHariel );
        
        Musica  CoracaoNaGeladeira = new  Musica ( "Coraçaõ na Geladeira" , "2017" , McHariel );                
        Musica  Ressaca = new  Musica ( "Ressaca" , "2019" , McKevin );
        
        Musica  Veracruz = new  Musica ( "Veracruz" , "2019" , McKevin );
        
        Musica  JogaBola = new  Musica ( "JogaBola" , "2019" , McKevin );
        
        Musica  Clima = new  Musica ( "CLima" , "2019" , McKevin );
        
        Musica  Vencedores = new  Musica ( "Vencedores" , "2019" , McKevin );
        
        Musica  Bailao = new  Musica ( "Bailão" , "2019" , McKevin );
        
        Musica  Cavalinho = new  Musica ( "Cavalinho" , "2019" , McKevin );
        
        Musica  JaguarDoAno = new  Musica ( "JaguarDoAno" , "2021" , McKevin );
        
        Musica  VidaDeArtista = new  Musica ( "Vida De Artista" , "2021" , McKevin );
        
        Musica  PassarDeFoguetao = new  Musica ( "Passar De Foguetão" , "2021" , McKevin );
                
                
                
                
                
                
        Musica Quarto= new Musica("Quarto","2022",Japa);
                        
        Musica Arigato= new Musica("Arigato","2022",Japa);
                         
        Musica Playboy= new Musica("Playboy","2022",Japa);
                        
        Musica Japao= new Musica("Japao","2022",Japa);
                        
        Musica NoTies= new Musica("NoTies","2022",Japa);
                         
        Musica VVS= new Musica("VVS","2022",Japa);
                         
        Musica DNA= new Musica("DNA","2022",Japa);
                         
        Musica AguasRasas= new Musica("AguasRasas","2022",Japa);
                         
        Musica YE= new Musica("YE","2022",Japa);
                         
        Musica DreamGirl= new Musica("DreamGirl","2022",Japa);
                         
        Musica Kurt= new Musica("Kurt","2022",Japa);
                        
        Musica MiraInterludio= new Musica("MiraInterludio","2022",Japa);
                        
                

        Musica NeSegredo= new Musica("NeSegredo","2020",MCCabelinho);
                
        Musica Posturadao= new Musica("Posturadao","2020",FilipeRet);
                
        Musica Maturidade= new Musica("Maturidade","2020",KayBlack);
                
        Musica a7Meiota= new Musica("7Meiota","2020",FilipeRet);
                
        Musica Kweller202= new Musica("202","2020",Kweller);
                
        Musica ConhecoBem= new Musica("ConhecoBem","2020",Kweller);
                
        Musica Dior= new Musica("Dior","2020",BIN);
                
        Musica Bahia= new Musica("Bahia","2020",Alee);
                
        Musica OutroPatamar= new Musica("OutroPatamar","2020",BIN);
                
        Musica Ochamado= new Musica("Ochamado","2020",Chefin);
                
        Musica Chefin212= new Musica("212","2020",Chefin);
                
        Musica Pandora= new Musica("Pandora","2020",DJMattD);
                
        Musica FFM= new Musica("F*F*M*","2020",FilipeRet);
                
        Musica CoopedUp= new Musica("CoopedUp","2020",PostMalone);
                
        Musica ICEONMYWRIST= new Musica("ICEONMYWRIST","2021",Derek);
                
        Musica Insane= new Musica("Insane","2020",PostMalone);
                
        Musica WrappedAroundYourFinger= new Musica("WrappedAroundYourFinger","2020",PostMalone);
                
        Musica ILikeYou= new Musica("ILikeYou","2020",PostMalone);
                
        Musica ICannotBe= new Musica("ICannotBe","2020",PostMalone);
                
        Musica LoveHate= new Musica("Love/Hate","2020",PostMalone);
                
        Musica Euthanasia= new Musica("Euthanasia","2020",PostMalone);
                
        Musica WhenImAlone= new Musica("WhenImAlone","2020",PostMalone);
                
        Musica Hateful= new Musica("Hateful","2020",PostMalone);
                
        Musica Gangshit= new Musica("gangshit","2021",Derek);
                
        Musica Circles= new Musica("Circles","2020",PostMalone);
                
        Musica BondeDaFumaca= new Musica("Bonde da Fumaca","2021",Derek);
                
        Musica MlksDeSP= new Musica("Mlks de SP","2020",Derek);
                
        Musica HollywoodsBleeding= new Musica("HollywoodsBleeding","2020",PostMalone);
                
        Musica DieForMe= new Musica("DieForMe","2020",PostMalone);
                
        Musica OnTheRoad= new Musica("OnTheRoad","2020",PostMalone);
                
        Musica TakaWhatYouWant= new Musica("TakaWhatYouWant","2020",PostMalone);
                
        Musica ImGonnaBe= new Musica("ImGonnaBe","2020",PostMalone);
                
        Musica Internet= new Musica("Internet","2020",PostMalone);
                
        Musica Plaqtudum= new Musica("Plaqtudum","2018",Derek);
                
        Musica FlackJack= new Musica("FlackJack","2018",Derek);
                
        Musica Myself= new Musica("Myself","2020",PostMalone);
                
        Musica Iknow= new Musica("Iknow","2020",PostMalone);
                
        Musica WOW= new Musica("WOW","2020",PostMalone);
                
        Musica Paranoid= new Musica("Paranoid","2020",PostMalone);
                
        Musica SpoilMyNight= new Musica("SpoilMyNight","2020",PostMalone);
                
        
        
        
        
        
        
        
        Musica RichESad= new Musica("Rich&Sad","2020",PostMalone);
                
        Musica ZackAndCodeine= new Musica("ZackAndCodeine","2020",PostMalone);
                
        Musica TakinShots= new Musica("TakinShots","2020",PostMalone);
                
        Musica Rockstar= new Musica("Rockstar","2020",PostMalone);
                
        Musica OverNow= new Musica("OverNow","2020",PostMalone);
                
        Musica Uzi2= new Musica("Uzi 2","2018",Derek);
                
        Musica Doko= new Musica("Doko","2016",McIgu);
                
        Musica BallForMe= new Musica("BallForMe","2020",PostMalone);
                
        Musica Otherside= new Musica("Otherside","2020",PostMalone);
                
        
        
        
        
        Musica AkDoJapao = new Musica("Ak do japao","2020",McIgu);
                
        Musica BlameItOnMe= new Musica("BlameItOnMe","2020",PostMalone);
                
        Musica SameBitches= new Musica("SameBitches","2020",PostMalone);
                
        Musica Jonestown= new Musica("Jonestown","2020",PostMalone);
                
        Musica a92Explorer= new Musica("92Explorer","2020",PostMalone);
                
        Musica Franca= new Musica("Franca","2018",McIgu);
                
        Musica SugarWraith= new Musica("SugarWraith","2020",PostMalone);
                
        Musica BigLie= new Musica("BigLie","2020",PostMalone);
                
        Musica DejaVu= new Musica("DejaVu","2020",PostMalone);
                
        Musica NoOption= new Musica("NoOption","2020",PostMalone);
                
        Musica Cold= new Musica("Cold","2020",PostMalone);
                
        
        
        
        
        
        
        Musica Patient= new Musica("Patient","2020",PostMalone);
                
        Musica GoFlex= new Musica("GoFlex","2020",PostMalone);
                
        Musica Feel= new Musica("Feel","2020",PostMalone);
                
        Musica TooYoug= new Musica("TooYoug","2020",PostMalone);
                
        Musica Congratulations= new Musica("Congratulations","2020",PostMalone);
                
        Musica UpThere= new Musica("UpThere","2020",PostMalone);
                
        Musica Leave= new Musica("Leave","2020",PostMalone);
                
        Musica HitThisHard= new Musica("HitThisHard","2020",PostMalone);
                        
        

        Musica ComoEuTeQuero = new Musica("Como eu Te Quero", "2009", BlackAlien);
		
		
		if( dia == 1 || dia == 4 || dia == 7 || dia == 10 || dia == 13 || dia == 16 || dia == 19 || dia == 22 || dia == 25 || dia == 28) {
			
			Slot a1 = new Slot(2,1, MiamiVice);
			
			Slot a2 = new Slot(2,2, Wave);
				
			Slot a3 = new Slot(2,3, Vlife);
		
			Slot a4 = new Slot(2, 4, Margiela);
			
			Slot a5 = new Slot(2,5, WaterWater);
			
			Slot a6 = new Slot(2,6, OnlyFans);
			
			Slot a7 = new Slot(2,7, Lilas);
	
			Slot a8 = new Slot(2,8, Highlights);
				
			Slot a9 = new Slot(2,9, a30Dias);
		
			Slot a10 = new Slot(2,10, RSS);
	
			Slot a11 = new Slot(2,11, LuisaSonza);

			Slot a12 = new Slot(2,12, ScoobyDoo);
		
			Slot a13 = new Slot(2,13, a360);
			
			Slot a14 = new Slot(2,14, ITOLDYOU);
			
			Slot a15 = new Slot(2,15, ForReal);
			
			Slot a16 = new Slot(2, 16, NoCap);
	
			Slot a17 = new Slot(2,17, FeFeFe);
				
			Slot a18 = new Slot(2,18, EuTenhoDrip);
		
			Slot a19 = new Slot(2,89, KylieJenner);
			
			Slot a20 = new Slot(2,20, PlayboyInternacional);
	
			Slot a21 = new Slot(2,21, Vilao);
	
			Slot a22 = new Slot(2,22, Monstro);
	
			Slot a23 = new Slot(2,23, HayabusaChromo);
	
			Slot a24 = new Slot(2,24, DriftDeYasuo);
	
			Slot a25 = new Slot(2,25, KatanaEPistola);
	
			Slot a26 = new Slot(2,26, RidersX);
	
			Slot a27 = new Slot(2,27, a7K);
	
			Slot a28 = new Slot(2,28, NewWave);
	
			Slot a29 = new Slot(2,29, OSegredoAlemDoJardim);
	
			Slot a30 = new Slot(2,30, Ninja);
	
			Slot a31 = new Slot(2,31, Piloto);
	
			Slot a32 = new Slot(2,32, Pleasurekreft);
	
			Slot a33 = new Slot(2,33, California);
	
			Slot a34 = new Slot(2,34, AutumnRingMini);
			
			Slot a35 = new Slot(2,35, SuzukiEscudo);
			
			Slot a36 = new Slot(2,36, Autobahn);
			
			Slot a37 = new Slot(2,37, AkatsukiDeVila);
				
			Slot a38 = new Slot(2,38, JesusChorouPt2);
		
			Slot a39 = new Slot(2,39, SemSinal);
			
			Slot a40 = new Slot(2,40, RejeiteFalsosIcones);
			
			Slot a41 = new Slot(2,41, Vampiro);
	
			Slot a42 = new Slot(2,42, SemDo);
	
			Slot a43 = new Slot(2,43, Groupies);
		
			Slot a44 = new Slot(2,44, QuerVoar);

			Slot a45 = new Slot(2,45, M4);
	
			Slot a46 = new Slot(2,46, Banco);
			
			Slot a47 = new Slot(2,47, AMorteDoAutotune);
			
			Slot a48 = new Slot(2,48, QuemMandaEA30);
	
			Slot a49 = new Slot(2,49, BalAzul);
	
			Slot a50 = new Slot(2,50, TavaBom);
	
			Slot a51 = new Slot(2,51, UmaBala);
	
			Slot a52 = new Slot(2,52, KennyG);
	
			Slot a53 = new Slot(2,53, a777666);
	
			Slot a54 = new Slot(2,54, Antes);
	
			Slot a55 = new Slot(2,55, ESal);
	
			Slot a56 = new Slot(2,56, MaquinaDoTempo);
	
			Slot a57 = new Slot(2,57, Cogulandia);
	
			Slot a58 = new Slot(2,58, Manha);
	
			Slot a59 = new Slot(2,59, DiaAzul);
	
			Slot a60 = new Slot(2,60, Fashion);
			
            Slot a61 = new Slot(2,61, ComeOn );         

            Slot a62 = new Slot(2,62, RockNRoll );
       
            Slot a63 = new Slot(2,63, Location );
            
            Slot a64 = new Slot(2,64, AmericaTeen );
           
            Slot a65 = new Slot(2,65, Grenade );
            
            Slot a66 = new Slot(2,66, CountOnMe );
    
            Slot a67 = new Slot(2,67, MarryYou );
               
            Slot a68 = new Slot(2,68, Photograph );
        
            Slot a69 = new Slot(2,69, ShapeOfYou);

            Slot a70 = new Slot(2,70, Perfect );
            
			Slot a71 = new Slot(2,71, LouisVMeninaLinda);
			
			Slot a72 = new Slot(2, 72, NaoMeSintoMAlMais);
			
			Slot a73 = new Slot(2,73, EstacionaEDesce);
				
			Slot a74 = new Slot(2,74, AiPreto);
		
			Slot a75 = new Slot(2,75, Perdicao);

			Slot a76 = new Slot(2,76, SeiQueTuGostaMuito);
			
			Slot a77 = new Slot(2,77, Metflix);
			
			Slot a78 = new Slot(2,78, SenteAMarra);
				
			Slot a79 = new Slot(2,79, ACaraDocrime2);
		
			Slot a80 = new Slot(2,80, Congratulation);
			
			Slot a81 = new  Slot(2,81, LemonTree );
	
            Slot a82 = new Slot (2,82, Stay );
                    
            Slot a83 = new Slot (2,83, Circle );
                       
            Slot a84 = new Slot (2,84, CandyPaint );
                        
            Slot a85 = new Slot (2,85, Goodbyes);
                        
            Slot a86 = new Slot (2,86, Baby );
                
            Slot a87 = new Slot (2,87, OneTime );
                            
            Slot a88 = new Slot (2,88, Marquinha );
                    
            Slot a89 = new Slot (2,89, Silence );
                        
            Slot a90 = new Slot (2,90, Happier );
            
            Slot a91 = new Slot (2,91, Yellow );
                            
            Slot a92 = new  Slot (2,92, FixYou );
                    
            Slot  a93 = new  Slot ( 2 , 93 , VivaLaVida );
                        
            Slot  a94 = new  Slot ( 2 , 94 , LoveOfMine);
                        
            Slot  a95 = new  Slot ( 2 , 95 , Beliver );
                        
            Slot  a96 = new  Slot ( 2 , 96 , Birds );
                
            Slot  a97 = new  Slot ( 2 , 97 , Chanel );
                            
            Slot  a98 = new  Slot ( 2 , 98 , Nights );
                    
            Slot  a99 = new  Slot ( 2 , 99 , A505 );
                
            Slot a100 = new  Slot ( 2 , 100 , JaVirouRotina );
            
			Slot a101 = new Slot(2, 101, Agua);
	
			Slot a102 = new Slot(2, 102, OkBaby);
	
			Slot a103 = new Slot(2, 103, Rn);
	
			Slot a104 = new Slot(2, 104, Dejavu);
	
			Slot a105 = new Slot(2, 105, Osaka);
	
			Slot a106 = new Slot(2, 106, Kyoto);
	
			Slot a107 = new Slot(2, 107, DieForYou);
	
			Slot a108 = new Slot(2, 108, a2036);
	
			Slot a109 = new Slot(2, 109, High);
	
			Slot a110 = new Slot(2, 110, SpikeLee);
	
			Slot a112 = new Slot(2, 112, Yokono);
			
			Slot a111 = new Slot(2, 111, ComoEuTeQuero);
	
			Slot a113 = new Slot(2, 113, Salao);
	
			Slot a114 = new Slot(2, 114, QuemEQuem);
	
			Slot a115 = new Slot(2, 115, Prada);
			
			Slot a116 = new Slot(2, 116, POCPOC);
			
			Slot a117 = new Slot(2, 117, JackBauer);
			
			Slot a118 = new Slot(2, 118, Honda);
	
			Slot a119 = new Slot(2, 119, TT);
	
			Slot a120 = new Slot(2, 120, Rush);
			
			Slot a121 = new Slot(2, 121, Balenciaga);
	
			Slot a122 = new Slot(2, 122, LV);
	
			Slot a123 = new Slot(2, 123, Snakes);
	
			Slot a124 = new Slot(2, 124, Mob);
	
			Slot a125 = new Slot(2, 125, NovoRico);
	
			Slot a126 = new Slot(2, 126, Netflix);
	
			Slot a127 = new Slot(2, 127, Dinero);
	
			Slot a128 = new Slot(2, 128, VidaDeChafe);
	
			Slot a129 = new Slot(2, 129, TipoGiroflex);
			
			Slot a130 = new Slot(2, 130, OPretoMaiscaro);
	
			Slot a131 = new Slot(2,131, DoubleCup);
				
			Slot a132 = new Slot(2,132, Evoque);
		
			Slot a133 = new Slot(2,133, a212Vip);
	
			Slot a134 = new Slot(2, 134, Flash);
	
			Slot a135 = new Slot(2,135, Medina);
	
			Slot a136 = new Slot(2,136, TipoGTA);
	
			Slot a137 = new Slot(2,137, NaoPisaNoMeuBoot);
		
			Slot a138 = new Slot(2,138, OPaiTaOn);

			Slot a139 = new Slot(2,139, SeSegura);
			
			Slot a140 = new Slot(2,140, VestidoDaFendi);

			Slot a141 = new Slot(2,141, Licor43);
				
			Slot a142 = new Slot(2,142, Lembrancas);
		
			Slot a143 = new Slot(2, 143, Tralha);
			
			Slot a144 = new Slot(2,144, FogueteDaNasa);
			
			Slot a145 = new Slot(2,145, Freestyle);
			
            Slot a146 = new  Slot (2 , 146 , Brasa );
                
            Slot  a147 = new  Slot ( 2 , 147 , Lucidez );
        
            Slot  a148 = new  Slot ( 2 ,148 , Envolver );
            
            Slot  a149 = new  Slot ( 2 , 149 , LaLoto );
            
            Slot  a150 = new  Slot ( 2 , 150 , VersionofMe);
            
            Slot  a151 = new  Slot ( 2 , 151 , WaterlmelonSugar );
    
            Slot  a152 = new  Slot ( 2 , 152 , AtItWas );
                
            Slot  a153 = new  Slot ( 2 , 153 , Matilda );
        
            Slot  a154 = new  Slot ( 2 , 154 , BetterNow );

            Slot  a155 = new  Slot ( 2 , 155 , Psycho );
    
            Slot  a156 = new  Slot ( 2 , 156 , Boyfriend );
                
            Slot  a157 = new  Slot ( 2 , 157 , Allergic );
        
            Slot  a158 = new  Slot ( 2 , 157 , SaintTropez );
            
            Slot  a159 = new  Slot ( 2 , 159 , Somebody );
            
            Slot  a160 = new  Slot ( 2 , 160 , Doutora3 );
            
            Slot  a161 = new  Slot ( 2 , 161 , CavaloDeTroia );
    
            Slot  a162 = new  Slot ( 2 , 162 , Cracolandia );
                
            Slot  a163 = new  Slot ( 2 , 163 , Sunflower );
        
            Slot  a164 = new  Slot ( 2 , 164 , internet );

            Slot  a165 = new  Slot ( 2 , 165 , Enemies );

            Slot  a166 = new  Slot ( 2 , 166 , NeverSayNever );
    
            Slot  a167 = new  Slot ( 2 , 167 , NoisTaBolandoUmPlano );
    
            Slot  a168 = new  Slot ( 2 , 168 , MacaVerde );
        
            Slot  a169 = new  Slot ( 2 , 169 , TiraDeGiro );

            Slot  a170 = new  Slot ( 2 , 170 , MoBrisa );
    
            Slot  a171 = new  Slot ( 2 , 171 , PraTeVer );
            
            Slot  a172 = new  Slot ( 2 , 172 , LeiDoRetorno );
            
            Slot  a173 = new  Slot ( 2 , 173 , Obssessao );
    
            Slot  a174 = new  Slot ( 2 , 174 , QuemTemDo );
    
            Slot  a175 = new  Slot ( 2 , 175 , CoracaoNaGeladeira);
            
            Slot  a176 = new  Slot ( 2 , 176 , Ressaca );
    
            Slot  a177 = new  Slot ( 2 , 177 , LV );
    
            Slot  a178 = new  Slot ( 2 , 178 , JogaBola );
    
            Slot  a179 = new  Slot ( 2 , 179 , Clima );
    
            Slot  a180 = new  Slot ( 2 , 180 , Vencedores );
    
            Slot  a181 = new  Slot ( 2 , 181 , Bailao );
    
            Slot  a182 = new  Slot ( 2 , 182 , Cavalinho );
    
            Slot  a183 = new  Slot ( 2 , 183 , JaguarDoAno );
    
            Slot  a184 = new  Slot ( 2 , 184 , VidaDeArtista );
    
            Slot  a185 = new  Slot ( 2 , 185 , PassarDeFoguetao );
            
			Slot a186 = new Slot(2,186, DinheiroMeSonda);
			
			Slot a187 = new Slot(2, 187, Forbes);
	
			Slot a188 = new Slot(2,188, ElaRebolaPraMimeSenta);
				
			Slot a189 = new Slot(2,189, Marquinha);
		
			Slot a190 = new Slot(2, 190, MeninoBom);
			
			Slot a191 = new Slot(2,191, EuSoDeslizo);
	
			Slot a192 = new Slot(2,192, DripdeNegao);
				
			Slot a193 = new Slot(2,193, RockNRoll);
		
			Slot a194 = new Slot(2, 194, PretoRico);
			
			Slot a195 = new Slot(2,195, TranseiComAMorte);
			
			Slot a196 = new Slot(2,196, Cassino);
			
			Slot a197 = new Slot(2,197, SuaSafada);
	
			Slot a198 = new Slot(2,198, Oracao);
				
			Slot a199 = new Slot(2,199, Progresso);
		
			Slot a200 = new Slot(2,200, DizQueEHoje);
			
			Slot a201 = new Slot(2,201, Felina);
				
			Slot a202 = new Slot(2,202, Sertao);
		
			Slot a203 = new Slot(2,203, AmigaTalarica);
			
			Slot a204 = new Slot(2,204, Pitbull);
	
			Slot a205 = new Slot(2,205, LagrimasDecrocodilo);
				
			Slot a206 = new Slot(2,206, Obraz);
		
			Slot a207 = new Slot(2, 207, Mantem);
			
			Slot a208 = new Slot(2,208, Sucrilhos);
			
			Slot a209 = new Slot(2,209, OCaveiraoChegou);
			
			Slot a210 = new Slot(2,210, OMaestroDosFluxos);
			
			Slot a211 = new Slot(2,211, HinoDosParedoes);
				
			Slot a212 = new Slot(2,212, Liberdade);
		
			Slot a213 = new Slot(2, 213, MegaRaveSemChao);
			
			Slot a214 = new Slot(2,214, RaveDaSirene);

			Slot a215 = new Slot(2,215, IrmaGostosa);
			
			Slot a216 = new Slot(2,216, FazerFalta);
			
			Slot a217 = new Slot(2,217, SenteAMarra);
				
			Slot a218 = new Slot(2,218, CalendarioDoPapai);
		
			Slot a219 = new Slot(2,219, ToGostandoTantoDeVoce);
			
			Slot a220 = new Slot(2, 220, Reputation);
			
    		Slot a221 = new Slot(2, 221, Patient);
    		
    		Slot a222 = new Slot(2, 222, GoFlex);
    		
    		Slot a223 = new Slot(2, 223, Feel);
    		
    		Slot a224 = new Slot(2, 224, TooYoug);
    		
    		Slot a225 = new Slot(2, 225, Congratulations);
    		
    		Slot a226 = new Slot(2, 226, UpThere);
    		
    		Slot a227 = new Slot(2, 227, Leave);
    		
    		Slot a228 = new Slot(2, 228, HitThisHard);
			
    		Slot a229 = new Slot(2, 229, NeSegredo);
    		
    		Slot a230 = new Slot(2, 230, Posturadao);
    		
    		Slot a231 = new Slot(2, 231, Maturidade);
    		
    		Slot a232 = new Slot(2, 232, a7Meiota);
    		
    		Slot a233 = new Slot(2, 233, Kweller202);
    		
    		Slot a234 = new Slot(2, 234, ConhecoBem);
    		
    		Slot a235 = new Slot(2, 235, Dior);
    		
    		Slot a236 = new Slot(2, 236, Bahia);
    		
    		Slot a237 = new Slot(2, 237, OutroPatamar);
    		
    		Slot a238 = new Slot(2, 238, Ochamado);
    		
    		Slot a239 = new Slot(2, 239, Chefin212);
    		
    		Slot a240 = new Slot(2, 240, Pandora);
    		
    		Slot a241 = new Slot(2, 241, FFM);
    		
    		Slot a242 = new Slot(2, 242, CoopedUp);
 
    		Slot a243 = new Slot(2, 243, ICEONMYWRIST);
    		
    		Slot a244 = new Slot(2, 244, Insane);
    		
    		Slot a245 = new Slot(2, 245, WrappedAroundYourFinger);
    		
    		Slot a246 = new Slot(2, 246, ILikeYou);
    		
    		Slot a247 = new Slot(2, 247, ICannotBe);
    		
    		Slot a248 = new Slot(2, 248, LoveHate);
    		
    		Slot a249 = new Slot(2, 249, Euthanasia);
    		
    		Slot a250 = new Slot(2, 250, WhenImAlone);
    		
    		Slot a251 = new Slot(2, 251, Hateful);
    		
    		Slot a252 = new Slot(2, 252, Gangshit);
    		
    		Slot a253 = new Slot(2, 253, Circles);
    		
    		Slot a254 = new Slot(2, 254, BondeDaFumaca);
    		
    		Slot a255 = new Slot(2, 255, MlksDeSP);
    		
    		Slot a256 = new Slot(2, 256, HollywoodsBleeding);
    		
    		Slot a257 = new Slot(2, 257, DieForMe);
    		
    		Slot a258 = new Slot(2, 258, OnTheRoad);
    		
    		Slot a259 = new Slot(2, 259, TakaWhatYouWant);
    		
    		Slot a260 = new Slot(2, 260, ImGonnaBe);
    		
    		Slot a261 = new Slot(2, 261, Internet);
    		
    		Slot a262 = new Slot(2, 262, Plaqtudum);
    		
    		Slot a263 = new Slot(2, 263, FlackJack);
    		
    		Slot a264 = new Slot(2, 264, Myself);
    		
    		Slot a265 = new Slot(2, 265, Iknow);
    		
    		Slot a266 = new Slot(2, 266, WOW);
    		
    		Slot a267 = new Slot(2, 267, Paranoid);
    		
    		Slot a268 = new Slot(2, 268, SpoilMyNight);
    		
    		Slot a269 = new Slot(2, 269, AkDoJapao);
    		
    		Slot a270 = new Slot(2, 270, BlameItOnMe);
    		
    		Slot a271 = new Slot(2, 271, SameBitches);
    		
    		Slot a272 = new Slot(2, 272, Jonestown);
    		
    		Slot a273 = new Slot(2, 273, a92Explorer);
    		
    		Slot a274 = new Slot(2, 274, Franca);
    		
    		Slot a275 = new Slot(2, 275, SugarWraith);
    		
    		Slot a276 = new Slot(2, 276, BigLie);
    		
    		Slot a277 = new Slot(2, 277, DejaVu);
    		
    		Slot a278 = new Slot(2, 278, NoOption);
    		
    		Slot a279 = new Slot(2, 279, Cold);
    		
    		Slot a280 = new Slot(2, 280, Quarto);
    			
     		Slot a281 = new Slot(2, 281, Arigato);
     		
     		Slot a282 = new Slot(2, 282, Playboy);
     		
     		Slot a283 = new Slot(2, 283, Japao);
     		
     		Slot  a284 = new Slot(2, 284, NoTies);
     		
     		Slot  a285 = new Slot(2, 285, VVS);
     		
     		Slot  a286 = new Slot(2, 286, DNA);
     		
     		Slot  a287 = new Slot(2, 287, AguasRasas);
     		
     		Slot  a288 = new Slot(2, 288, YE);
     		
     		
     		
     		
     		System.out.println(a1.descrição());
            System.out.println(a2.descrição());
            System.out.println(a3.descrição());
            System.out.println(a4.descrição());
            System.out.println(a5.descrição());
            System.out.println(a6.descrição());
            System.out.println(a7.descrição());
            System.out.println(a8.descrição());
            System.out.println(a9.descrição());
            System.out.println(a10.descrição());
            System.out.println(a11.descrição());
            System.out.println(a12.descrição());
            System.out.println(a13.descrição());
            System.out.println(a14.descrição());
            System.out.println(a15.descrição());
            System.out.println(a16.descrição());
            System.out.println(a17.descrição());
            System.out.println(a18.descrição());
            System.out.println(a19.descrição());
            System.out.println(a20.descrição());
            System.out.println(a21.descrição());
            System.out.println(a22.descrição());
            System.out.println(a23.descrição());
            System.out.println(a24.descrição());
            System.out.println(a25.descrição());
            System.out.println(a26.descrição());
            System.out.println(a27.descrição());
            System.out.println(a28.descrição());
            System.out.println(a29.descrição());
            System.out.println(a30.descrição());
            System.out.println(a31.descrição());
            System.out.println(a32.descrição());
            System.out.println(a33.descrição());
            System.out.println(a34.descrição());
            System.out.println(a35.descrição());
            System.out.println(a36.descrição());
            System.out.println(a37.descrição());
            System.out.println(a38.descrição());
            System.out.println(a39.descrição());
            System.out.println(a40.descrição());
            System.out.println(a41.descrição());
            System.out.println(a42.descrição());
            System.out.println(a43.descrição());
            System.out.println(a44.descrição());
            System.out.println(a45.descrição());
            System.out.println(a46.descrição());
            System.out.println(a47.descrição());
            System.out.println(a48.descrição());
            System.out.println(a49.descrição());
            System.out.println(a50.descrição());
            System.out.println(a51.descrição());
            System.out.println(a52.descrição());
            System.out.println(a53.descrição());
            System.out.println(a54.descrição());
            System.out.println(a55.descrição());
            System.out.println(a56.descrição());
            System.out.println(a57.descrição());
            System.out.println(a58.descrição());
            System.out.println(a59.descrição());
            System.out.println(a60.descrição());
            System.out.println(a61.descrição());
            System.out.println(a62.descrição());
            System.out.println(a63.descrição());
            System.out.println(a64.descrição());
            System.out.println(a65.descrição());
            System.out.println(a66.descrição());
            System.out.println(a67.descrição());
            System.out.println(a68.descrição());
            System.out.println(a69.descrição());
            System.out.println(a70.descrição());
            System.out.println(a71.descrição());
            System.out.println(a72.descrição());
            System.out.println(a73.descrição());
            System.out.println(a74.descrição());
            System.out.println(a75.descrição());
            System.out.println(a76.descrição());
            System.out.println(a77.descrição());
            System.out.println(a78.descrição());
            System.out.println(a79.descrição());
            System.out.println(a80.descrição());
            System.out.println(a81.descrição());
            System.out.println(a82.descrição());
            System.out.println(a83.descrição());
            System.out.println(a84.descrição());
            System.out.println(a85.descrição());
            System.out.println(a86.descrição());
            System.out.println(a87.descrição());
            System.out.println(a88.descrição());
            System.out.println(a89.descrição());
            System.out.println(a90.descrição());
            System.out.println(a91.descrição());
            System.out.println(a92.descrição());
            System.out.println(a93.descrição());
            System.out.println(a94.descrição());
            System.out.println(a95.descrição());
            System.out.println(a96.descrição());
            System.out.println(a97.descrição());
            System.out.println(a98.descrição());
            System.out.println(a99.descrição());
            System.out.println(a100.descrição());
            System.out.println(a101.descrição());
            System.out.println(a102.descrição());
            System.out.println(a103.descrição());
            System.out.println(a104.descrição());
            System.out.println(a105.descrição());
            System.out.println(a106.descrição());
            System.out.println(a107.descrição());
            System.out.println(a108.descrição());
            System.out.println(a109.descrição());
            System.out.println(a110.descrição());
            System.out.println(a111.descrição());
            System.out.println(a112.descrição());
            System.out.println(a113.descrição());
            System.out.println(a114.descrição());
            System.out.println(a115.descrição());
            System.out.println(a116.descrição());
            System.out.println(a117.descrição());
            System.out.println(a118.descrição());
            System.out.println(a119.descrição());
            System.out.println(a120.descrição());
            System.out.println(a121.descrição());
            System.out.println(a122.descrição());
            System.out.println(a123.descrição());
            System.out.println(a124.descrição());
            System.out.println(a125.descrição());
            System.out.println(a126.descrição());
            System.out.println(a127.descrição());
            System.out.println(a128.descrição());
            System.out.println(a129.descrição());
            System.out.println(a130.descrição());
            System.out.println(a131.descrição());
            System.out.println(a132.descrição());
            System.out.println(a133.descrição());
            System.out.println(a134.descrição());
            System.out.println(a135.descrição());
            System.out.println(a136.descrição());
            System.out.println(a137.descrição());
            System.out.println(a138.descrição());
            System.out.println(a139.descrição());
            System.out.println(a140.descrição());
            System.out.println(a141.descrição());
            System.out.println(a142.descrição());
            System.out.println(a143.descrição());
            System.out.println(a144.descrição());
            System.out.println(a145.descrição());
            System.out.println(a146.descrição());
            System.out.println(a147.descrição());
            System.out.println(a148.descrição());
            System.out.println(a149.descrição());
            System.out.println(a150.descrição());
            System.out.println(a151.descrição());
            System.out.println(a152.descrição());
            System.out.println(a153.descrição());
            System.out.println(a154.descrição());
            System.out.println(a155.descrição());
            System.out.println(a156.descrição());
            System.out.println(a157.descrição());
            System.out.println(a158.descrição());
            System.out.println(a159.descrição());
            System.out.println(a160.descrição());
            System.out.println(a161.descrição());
            System.out.println(a162.descrição());
            System.out.println(a163.descrição());
            System.out.println(a164.descrição());
            System.out.println(a165.descrição());
            System.out.println(a166.descrição());
            System.out.println(a167.descrição());
            System.out.println(a168.descrição());
            System.out.println(a169.descrição());
            System.out.println(a170.descrição());
            System.out.println(a171.descrição());
            System.out.println(a172.descrição());
            System.out.println(a173.descrição());
            System.out.println(a174.descrição());
            System.out.println(a175.descrição());
            System.out.println(a176.descrição());
            System.out.println(a177.descrição());
            System.out.println(a178.descrição());
            System.out.println(a179.descrição());
            System.out.println(a180.descrição());
            System.out.println(a191.descrição());
            System.out.println(a192.descrição());
            System.out.println(a193.descrição());
            System.out.println(a194.descrição());
            System.out.println(a195.descrição());
            System.out.println(a196.descrição());
            System.out.println(a197.descrição());
            System.out.println(a198.descrição());
            System.out.println(a199.descrição());
            System.out.println(a200.descrição());
            System.out.println(a201.descrição());
            System.out.println(a202.descrição());
            System.out.println(a203.descrição());
            System.out.println(a204.descrição());
            System.out.println(a205.descrição());
            System.out.println(a206.descrição());
            System.out.println(a207.descrição());
            System.out.println(a208.descrição());
            System.out.println(a209.descrição());
            System.out.println(a210.descrição());
            System.out.println(a211.descrição());
            System.out.println(a212.descrição());
            System.out.println(a213.descrição());
            System.out.println(a214.descrição());
            System.out.println(a215.descrição());
            System.out.println(a216.descrição());
            System.out.println(a217.descrição());
            System.out.println(a218.descrição());
            System.out.println(a219.descrição());
            System.out.println(a220.descrição());
            System.out.println(a221.descrição());
            System.out.println(a222.descrição());
            System.out.println(a223.descrição());
            System.out.println(a224.descrição());
            System.out.println(a225.descrição());
            System.out.println(a226.descrição());
            System.out.println(a227.descrição());
            System.out.println(a228.descrição());
            System.out.println(a229.descrição());
            System.out.println(a230.descrição());
            System.out.println(a231.descrição());
            System.out.println(a232.descrição());
            System.out.println(a233.descrição());
            System.out.println(a234.descrição());
            System.out.println(a235.descrição());
            System.out.println(a236.descrição());
            System.out.println(a237.descrição());
            System.out.println(a238.descrição());
            System.out.println(a239.descrição());
            System.out.println(a240.descrição());
            System.out.println(a241.descrição());
            System.out.println(a242.descrição());
            System.out.println(a243.descrição());
            System.out.println(a244.descrição());
            System.out.println(a245.descrição());
            System.out.println(a246.descrição());
            System.out.println(a247.descrição());
            System.out.println(a248.descrição());
            System.out.println(a249.descrição());
            System.out.println(a250.descrição());
            System.out.println(a251.descrição());
            System.out.println(a252.descrição());
            System.out.println(a253.descrição());
            System.out.println(a254.descrição());
            System.out.println(a255.descrição());
            System.out.println(a256.descrição());
            System.out.println(a257.descrição());
            System.out.println(a258.descrição());
            System.out.println(a259.descrição());
            System.out.println(a260.descrição());
            System.out.println(a261.descrição());
            System.out.println(a262.descrição());
            System.out.println(a263.descrição());
            System.out.println(a264.descrição());
            System.out.println(a265.descrição());
            System.out.println(a266.descrição());
            System.out.println(a267.descrição());
            System.out.println(a268.descrição());
            System.out.println(a269.descrição());
            System.out.println(a270.descrição());
            System.out.println(a271.descrição());
            System.out.println(a272.descrição());
            System.out.println(a273.descrição());
            System.out.println(a274.descrição());
            System.out.println(a275.descrição());
            System.out.println(a276.descrição());
            System.out.println(a277.descrição());
            System.out.println(a278.descrição());
            System.out.println(a279.descrição());
            System.out.println(a280.descrição());
            System.out.println(a281.descrição());
            System.out.println(a282.descrição());
            System.out.println(a283.descrição());
            System.out.println(a284.descrição());
            System.out.println(a285.descrição());
            System.out.println(a286.descrição());
            System.out.println(a287.descrição());
            System.out.println(a288.descrição()); 
		} else if( dia == 2 || dia == 5 || dia == 8 || dia == 11 || dia == 14 || dia == 17 || dia == 20 || dia == 23 || dia == 26 || dia == 29) {
			
			
			Slot  b1 = new  Slot (3, 1 , Congratulations );
            
            Slot  b2 = new  Slot (3, 2 , M4 );
                
            Slot  b3 = new  Slot (3, 3 , Goodbyes );
        
            Slot  b4 = new  Slot (3, 4 , Stay );
            
            Slot  b5 = new  Slot (3, 5 , Baby );
            
            Slot  b6 = new  Slot (3, 6 , OneTime );
            
            Slot  b7 = new  Slot (3, 7 , MoBrisa );
    
            Slot  b8 = new  Slot (3, 8 , CavaloDeTroia );
                
            Slot  b9 = new  Slot (3, 9 , Doutora3 );
        
            Slot  b10 = new  Slot (3, 10 , CandyPaint );
    
            Slot  b11 = new  Slot (3, 11 , Envolver );

            Slot  b12 = new  Slot (3, 12 , LemonTree );
        
            Slot  b13 = new  Slot (3, 13 , Cracolandia );
            
            Slot  b14 = new  Slot (3, 14 , MacaVerde );
            
            Slot  b15 = new  Slot (3, 15 , Somebody );
            
            Slot  b16 = new  Slot (3, 16 , Sunflower );
    
            Slot  b17 = new  Slot (3, 17 , internet );
                
            Slot  b18 = new  Slot (3, 18 , Enemies );
        
            Slot  b19 = new  Slot (3, 19 , NeverSayNever );
            
            Slot  b20 = new  Slot (3, 20 , NoisTaBolandoUmPlano );
    
            Slot  b21 = new  Slot (3, 21 , Yellow );
    
            Slot  b22 = new  Slot (3, 22 , FixYou );
    
            Slot  b23 = new  Slot (3, 23 , MarryYou);
    
            Slot  b24 = new  Slot (3, 24 , Better );
    
            Slot  b25 = new  Slot (3, 25 , AmericaTeen);
    
            Slot  b26 = new  Slot (3, 26 , Location );
    
            Slot  b27 = new  Slot (3, 27 , Peaches );
    
            Slot  b28 = new  Slot (3, 28 , Boyfriend );
    
            Slot  b29 = new  Slot (3, 29 , LouisVMeninaLinda );
    
            Slot  b30 = new  Slot (3, 30 , OCaveiraoChegou );
    
            Slot  b31 = new  Slot (3, 31 , Piloto );
    
            Slot  b32 = new  Slot (3, 32 , AiPreto );
    
            Slot  b33 = new  Slot (3, 33 , Circles );
    
            Slot  b34 = new  Slot (3, 34 , Silence );
            
            Slot  b35 = new  Slot (3, 35 , Photograph );
            
            Slot  b36 = new  Slot (3, 36 , ShapeOfYou );
            
            Slot  b37 = new  Slot (3, 37 , JaVirouRotina );
                
            Slot  b38 = new  Slot (3, 38 , ComoEuTeQuero);
        
            Slot  b39 = new  Slot (3, 39 , Perdicao );
            
            Slot  b40 = new  Slot (3, 40 , OMaestroDosFluxos );
            
            Slot  b41 = new  Slot (3, 41 , SemDo );
    
            Slot  b42 = new  Slot (3, 42 , Felina );
    
            Slot  b43 = new  Slot (3, 43 , Groupies );
        
            Slot  b44 = new  Slot (3, 44 , AMorteDoAutotune );

            Slot  b45 = new  Slot (3, 45 , DinheiroMeSonda );
    
            Slot  b46 = new  Slot (3, 46 , LuisaSonza );
            
            Slot  b47 = new  Slot (3, 47 , ScoobyDoo );
            
            Slot  b48 = new  Slot (3, 48 , VestidoDaFendi );
    
            Slot  b49 = new  Slot (3, 49 , TipoGTA );
    
            Slot  b50 = new  Slot (3, 50 , CalendarioDoPapai );
    
            Slot  b51 = new  Slot (3, 51 , Happier );
    
            Slot  b52 = new  Slot (3, 52 , ComeOn );
    
            Slot  b53 = new  Slot (3, 53 , PassarDeFoguetao);
    
            Slot  b54 = new  Slot (3, 54 , Honda );
    
            Slot  b55 = new  Slot (3, 55 , Netflix );
    
            Slot  b56 = new  Slot (3, 56 , Rush );
    
            Slot  b57 = new  Slot (3, 57 , Metflix );
    
            Slot  b58 = new  Slot (3, 58 , ACaraDocrime2);
    
            Slot  b59 = new  Slot (3, 59 , a7K );
    
            Slot  b60 = new  Slot (3, 60 , NaoMeSintoMAlMais);
            
            Slot  b61 = new  Slot (3, 61 , Grenade );         

            Slot  b62 = new  Slot (3, 62 , RockNRoll );
               
            Slot  b63 = new  Slot (3, 63 , VivaLaVida );
                    
            Slot  b64 = new  Slot (3, 64 , LoveOfMine );
                   
            Slot  b65 = new  Slot (3, 65 , A505 );
                    
            Slot  b66 = new  Slot (3, 66 , LaLoto );
            
            Slot  b67 = new  Slot (3, 67 , TiraDeGiro );
                       
            Slot  b68 = new  Slot (3, 68 , AtItWas );
                
            Slot  b69 = new  Slot (3, 69 , Vencedores );

            Slot  b70 = new  Slot (3, 70 , ComoEuTeQuero);
            
            Slot  b71 = new  Slot (3, 71 , Cogulandia);
            
            Slot  b72 = new  Slot (3, 72 , Fashion );
            
            Slot  b73 = new  Slot (3, 73 , Prada );
                
            Slot  b74 = new  Slot (3, 74 , MegaRaveSemChao );
        
            Slot  b75 = new  Slot (3, 75 , FazerFalta );

            Slot  b76 = new  Slot (3, 76 , ToGostandoTantoDeVoce );
            
            Slot  b77 = new  Slot (3, 77 , ElaRebolaPraMimeSenta);
            
            Slot  b78 = new  Slot (3, 78 , RockNRoll );
                
            Slot  b79 = new  Slot (3, 79 , DizQueEHoje);
        
            Slot  b80 = new  Slot (3, 80 , Highlights);
            
            Slot  b81 = new   Slot (3, 81 , a360 );
    
            Slot  b82 = new  Slot (3, 82 , Licor43 );

            Slot  b83 = new  Slot (3, 83 , a212Vip );

            Slot  b84 = new  Slot (3, 84 , NaoPisaNoMeuBoot );

            Slot  b85 = new  Slot (3, 85 , TT );

            Slot  b86 = new  Slot (3, 86 , Vampiro );

            Slot  b87 = new  Slot (3, 87 , TavaBom );

            Slot  b88 = new  Slot (3, 88 , ESal);

            Slot  b89 = new  Slot (3, 89 , DieForYou );

            Slot  b90 = new  Slot (3, 90 , RaveDaSirene );

            Slot  b91 = new  Slot (3, 91 , IrmaGostosa );

            Slot  b92 = new   Slot (3, 92 , SenteAMarra );

            Slot   b93 = new   Slot (3, 93 , LagrimasDecrocodilo);

            Slot   b94 = new   Slot (3, 94 , Sucrilhos );

            Slot   b95 = new   Slot (3, 95 , Mantem );

            Slot   b96 = new   Slot (3, 96 , Marquinha );

            Slot   b97 = new   Slot (3, 97 , PretoRico );

            Slot   b98 = new   Slot (3, 98 , DizQueEHoje);

            Slot   b99 = new   Slot (3, 99 , a30Dias );

            Slot  b100 = new   Slot (3, 100 , BlackMoney );

            Slot  b101 = new  Slot (3, 101 , BetterNow );
    
            Slot  b102 = new  Slot (3, 102 , Brasa );
    
            Slot  b103 = new  Slot (3, 103 , Lucidez );
    
            Slot  b104 = new  Slot (3, 104 , KylieJenner );
    
            Slot  b105 = new  Slot (3, 105 , Lembrancas );
    
            Slot  b106 = new  Slot (3, 106 , DoubleCup );
    
            Slot  b107 = new  Slot (3, 107 , Flash );
    
            Slot  b108 = new  Slot (3, 108 , Medina );
    
            Slot  b109 = new  Slot (3, 109 , LV );
    
            Slot  b110 = new  Slot (3, 110 , Dinero );
    
            Slot  b112 = new  Slot (3, 112 , Vilao );
            
            Slot  b111 = new  Slot (3, 111 , RidersX);
    
            Slot  b113 = new  Slot (3, 113 , California );
    
            Slot  b114 = new  Slot (3, 114 , SemSinal );
    
            Slot  b115 = new  Slot (3, 115 , EstacionaEDesce);
            
            Slot  b116 = new  Slot (3, 116 , Beliver );
            
            Slot  b117 = new  Slot (3, 117 , Matilda );
            
            Slot  b118 = new  Slot (3, 118 , PraTeVer );
    
            Slot  b119 = new  Slot (3, 119 , Bailao );
    
            Slot  b120 = new  Slot (3, 120 , QuemMandaEA30 );
            
            Slot  b121 = new  Slot (3, 121 , a777666 );
    
            Slot  b122 = new  Slot (3, 122 , KennyG );
    
            Slot  b123 = new  Slot (3, 123 , Agua );
    
            Slot  b124 = new  Slot (3, 124 , OkBaby );
    
            Slot  b125 = new  Slot (3, 125 , High );
    
            Slot  b126 = new  Slot (3, 126 , QuemEQuem );
    
            Slot  b127 = new  Slot (3, 127 , Reputation );
    
            Slot  b128 = new  Slot (3, 128 , Sertao );
    
            Slot  b129 = new  Slot (3, 129 , TiraDeGiro );
            
            Slot  b130 = new  Slot (3, 130 , Obraz );
    
            Slot  b131 = new  Slot (3, 131 , MeninoBom );
                
            Slot  b132 = new  Slot (3, 132 , Oracao );
        
            Slot  b133 = new  Slot (3, 133 , Wave );
    
            Slot  b134 = new  Slot (3, 134 , OnlyFans );
    
            Slot  b135 = new  Slot (3, 135 , ForReal );
    
            Slot  b136 = new  Slot (3, 136 , EuTenhoDrip );
    
            Slot  b137 = new  Slot (3, 137 , VestidoDaFendi );
        
            Slot  b138 = new  Slot (3, 138 , Evoque);

            Slot  b139 = new  Slot (3, 139 , SeSegura);
            
            Slot  b140 = new  Slot (3, 140 , Balenciaga);

            Slot  b141 = new  Slot (3, 141 , Snakes);
                
            Slot  b142 = new  Slot (3, 142 , Mob);
        
            Slot  b143 = new  Slot (3, 143 , VidaDeChafe);
            
            Slot  b144 = new  Slot (3, 144 , PlayboyInternacional);
            
            Slot  b145 = new  Slot (3, 145 , Monstro);
            
            Slot  b146 = new   Slot (3, 146 , HayabusaChromo);
                
            Slot   b147 = new   Slot (3, 147 , KatanaEPistola );
        
            Slot   b148 = new   Slot (3, 148 , NewWave );
            
            Slot   b149 = new   Slot (3, 149 , Piloto);
            
            Slot   b150 = new   Slot (3, 150 , AutumnRingMini);
            
            Slot   b151 = new   Slot (3, 151 , LeiDoRetorno );
    
            Slot   b152 = new   Slot (3, 152 , Obssessao );
                
            Slot   b153 = new   Slot (3, 153 , JogaBola );
        
            Slot   b154 = new   Slot (3, 154 , Cavalinho );

            Slot   b155 = new   Slot (3, 155 , WaterlmelonSugar );
    
            Slot   b156 = new   Slot (3, 156 , Perfect );
                
            Slot   b157 = new   Slot (3, 157 , ACaraDocrime2);
        
            Slot   b158 = new   Slot (3, 157 , RejeiteFalsosIcones);
            
            Slot   b159 = new   Slot (3, 159 , Autobahn );
            
            Slot   b160 = new   Slot (3, 160 , Ninja );
            
            Slot   b161 = new   Slot (3, 161 , JackBauer );
    
            Slot   b162 = new   Slot (3, 162 , SeSegura );
                
            Slot   b163 = new   Slot (3, 163 , OPaiTaOn );
        
            Slot   b164 = new   Slot (3, 164 , Freestyle );

            Slot   b165 = new   Slot (3, 165 , FogueteDaNasa);

            Slot   b166 = new   Slot (3, 166 , RSS );
    
            Slot   b167 = new   Slot (3, 167 , Vlife );
    
            Slot   b168 = new   Slot (3, 168 , DizQueEHoje );
        
            Slot   b169 = new   Slot (3, 169 , EuSoDeslizo );

            Slot   b170 = new   Slot (3, 170 , Pitbull );
    
            Slot   b171 = new   Slot (3, 171 , Salao );
            
            Slot   b172 = new   Slot (3, 172 , SenteAMarra );
            
            Slot   b173 = new   Slot (3, 173 , Liberdade );
    
            Slot   b174 = new   Slot (3, 174 , QuemTemDo );
    
            Slot   b175 = new   Slot (3, 175 , SpikeLee );
            
            Slot   b176 = new   Slot (3, 176 , Kyoto );
    
            Slot   b177 = new   Slot (3, 177 , OkBaby );
    
            Slot   b178 = new   Slot (3, 178 , DiaAzul );
    
            Slot   b179 = new   Slot (3, 179 , MaquinaDoTempo );
    
            Slot   b180 = new   Slot (3, 180 , ESal);
    
            Slot   b181 = new   Slot (3, 181 , UmaBala );
    
            Slot   b182 = new   Slot (3, 182 , Banco );
    
            Slot   b183 = new   Slot (3, 183 , QuerVoar );
    
            Slot   b184 = new   Slot (3, 184 , M4 );
    
            Slot   b185 = new   Slot (3, 185 , Manha );
            
            Slot  b186 = new  Slot (3, 186 , Rn );
            
            Slot  b187 = new  Slot (3, 187 , a2036 );
    
            Slot  b188 = new  Slot (3, 188 , Yokono );
                
            Slot  b189 = new  Slot (3, 189 , HinoDosParedoes );
        
            Slot  b190 = new  Slot (3, 190 , Felina );
            
            Slot  b191 = new  Slot (3, 191 , Mantem );
    
            Slot  b192 = new  Slot (3, 192 , Forbes );
                
            Slot  b193 = new  Slot (3, 193 , Cassino );
        
            Slot  b194 = new  Slot (3, 194 , TranseiComAMorte );
            
            Slot  b195 = new  Slot (3, 195 , SuaSafada );
            
            Slot  b196 = new  Slot (3, 196 , Progresso );
            
            Slot  b197 = new  Slot (3, 197 , DizQueEHoje);
    
            Slot  b198 = new  Slot (3, 198 , Margiela );
                
            Slot  b199 = new  Slot (3, 199 , WaterWater );
        
            Slot  b200 = new  Slot (3, 200 , Lilas );
            
            Slot  b201 = new  Slot (3, 201 , a30Dias );
                
            Slot  b202 = new  Slot (3, 202 , ITOLDYOU);
        
            Slot  b203 = new  Slot (3, 203 , FeFeFe );
            
            Slot  b204 = new  Slot (3, 204 , Lembrancas );
    
            Slot  b205 = new  Slot (3, 205 , Tralha );
                
            Slot  b206 = new  Slot (3, 206 , OPretoMaiscaro);
        
            Slot  b207 = new  Slot (3, 207 , a212Vip );
            
            Slot  b208 = new  Slot (3, 208 , POCPOC );
            
            Slot  b209 = new  Slot (3, 209 , NovoRico );
            
            Slot  b210 = new  Slot (3, 210 , TipoGiroflex);
            
            Slot  b211 = new  Slot (3, 211 , DriftDeYasuo);
                
            Slot  b212 = new  Slot (3, 212 , a7K );
        
            Slot  b213 = new  Slot (3, 213 , OSegredoAlemDoJardim );
            
            Slot  b214 = new  Slot (3, 214 , Pleasurekreft );

            Slot  b215 = new  Slot (3, 215 , SuzukiEscudo );
            
            Slot  b216 = new  Slot (3, 216 , California);
            
            Slot  b217 = new  Slot (3, 217 , AkatsukiDeVila );
                
            Slot  b218 = new  Slot (3, 218 , JesusChorouPt2 );
        
            Slot  b219 = new  Slot (3, 219 , RejeiteFalsosIcones);
            
            Slot  b220 = new  Slot (3, 220 , CountOnMe);
            
            Slot b221 = new Slot(3, 221, Otherside);
            
        
            
            Slot b222 = new Slot(3, 222, AkDoJapao);
            
            
            Slot b223 = new Slot(3, 223, BlameItOnMe);
            
            
            Slot b224 = new Slot(3, 224, SameBitches);
            
            
            Slot b225 = new Slot(3, 225, Jonestown);
            
            
            Slot b226 = new Slot(3, 226, a92Explorer);
            
            
            Slot b227 = new Slot(3, 227, Franca);
            
            
            Slot b228 = new Slot(3, 228, SugarWraith);
            
            
            Slot b229 = new Slot(3, 229, BigLie);
            
            
            Slot b230 = new Slot(3, 230, DejaVu);
            
            
            Slot b231 = new Slot(3, 231, NoOption);
            
            
            Slot b232 = new Slot(3, 232, Cold);

            
            Slot b233 = new Slot(3, 233, Patient);
            
            
            Slot b234 = new Slot(3, 234, GoFlex);
            
            
            Slot b235 = new Slot(3, 235, Feel);
            
            
            Slot b236 = new Slot(3, 236, TooYoug);
            
            
            Slot b237 = new Slot(3, 237, Congratulations);
            
            
            Slot b238 = new Slot(3, 238, UpThere);
            
            
            Slot b239 = new Slot(3, 239, Leave);
            
            
            Slot b240 = new Slot(3, 240, HitThisHard);

            
            Slot b241 = new Slot(3, 241, Quarto);
            
    
            Slot  b242 = new Slot(3, 242, Arigato);
            
    
            Slot b243 = new Slot(3, 243, Playboy);
            
   
            Slot b244 = new Slot(3, 244, Japao);
            
    
            Slot  b245 = new Slot(3, 245, NoTies);
            
            Slot  b246 = new Slot(3, 246, VVS);
            
   
            Slot  b247 = new Slot(3, 247, DNA);
            
   
            Slot  b248 = new Slot(3, 248, AguasRasas);
            
   
            Slot  b249 = new Slot(3, 249, YE);
            
   
            Slot  b250 = new Slot(3, 250, DreamGirl);
            
    
            Slot b251 = new Slot(3, 251, Kurt);
            
    
            Slot b252 = new Slot(3, 252, MiraInterludio);
            
            

            
            Slot b253 = new Slot(3, 255, NeSegredo);
            
            
            Slot b254 = new Slot(3, 254, Posturadao);
            
            
            Slot b255 = new Slot(3, 255, Maturidade);
            
            
            Slot b256 = new Slot(3, 256, a7Meiota);
            
            
            Slot b257 = new Slot(3, 257, Kweller202);
            
            
            Slot b258 = new Slot(3, 258, ConhecoBem);
            
            
            Slot b259 = new Slot(3, 259, Dior);
            
            
            Slot b260 = new Slot(3, 260, Bahia);
            
            Slot b261 = new Slot(3, 261, Paranoid);
        
            Slot b262 = new Slot(3, 262, SpoilMyNight);    
            
            
            Slot b263 = new Slot(3, 263, RichESad);
            
            
            Slot b264 = new Slot(3, 264, ZackAndCodeine);
            
            
            Slot b265 = new Slot(3, 265, TakinShots);
            
            
            Slot b266 = new Slot(3, 266, Rockstar);
            
            
            Slot b267 = new Slot(3, 267, OverNow);
            
            Slot b268 = new Slot(3, 268, Uzi2);
            
            
            
            Slot b269 = new Slot(3, 269, Doko);

            Slot b270 = new Slot(3, 260, WOW);

            
            Slot b271 = new Slot(3, 271, OutroPatamar);
            
            
            Slot b272 = new Slot(3, 272, Ochamado);
            
            
            Slot b273 = new Slot(3, 273, Chefin212);
            
            
            Slot b274 = new Slot(3, 274, Pandora);
            
            Slot b275 = new Slot(3, 275, FFM);
            
            
            Slot b276 = new Slot(3, 276, CoopedUp);
            
            
            Slot b277 = new Slot(3, 277, ICEONMYWRIST);
            
            
            Slot b278 = new Slot(3, 278, Insane);
            
            
            Slot b279 = new Slot(3, 279, WrappedAroundYourFinger);
            
            
            Slot b280 = new Slot(3, 280, ILikeYou);
            
            
            Slot b281 = new Slot(3, 281, ICannotBe);
            
            
            Slot b282 = new Slot(3, 282, LoveHate);
            
            
            Slot b283 = new Slot(3, 283, Euthanasia);
            
            
            Slot b284 = new Slot(3, 284, WhenImAlone);
            
            
            Slot b285 = new Slot(3, 285, Hateful);
            
            
            Slot b286 = new Slot(3, 286, Gangshit);
            
            
            Slot b287 = new Slot(3, 287, Circles);
            
            
            Slot b288 = new Slot(3, 288, BondeDaFumaca);  
            
            
            
            
            System.out.println(b1.descrição());
            System.out.println(b2.descrição());
            System.out.println(b3.descrição());
            System.out.println(b4.descrição());
            System.out.println(b5.descrição());
            System.out.println(b6.descrição());
            System.out.println(b7.descrição());
            System.out.println(b8.descrição());
            System.out.println(b9.descrição());
            System.out.println(b10.descrição());
            System.out.println(b11.descrição());
            System.out.println(b12.descrição());
            System.out.println(b13.descrição());
            System.out.println(b14.descrição());
            System.out.println(b15.descrição());
            System.out.println(b16.descrição());
            System.out.println(b17.descrição());
            System.out.println(b18.descrição());
            System.out.println(b19.descrição());
            System.out.println(b20.descrição());
            System.out.println(b21.descrição());
            System.out.println(b22.descrição());
            System.out.println(b23.descrição());
            System.out.println(b24.descrição());
            System.out.println(b25.descrição());
            System.out.println(b26.descrição());
            System.out.println(b27.descrição());
            System.out.println(b28.descrição());
            System.out.println(b29.descrição());
            System.out.println(b30.descrição());
            System.out.println(b31.descrição());
            System.out.println(b32.descrição());
            System.out.println(b33.descrição());
            System.out.println(b34.descrição());
            System.out.println(b35.descrição());
            System.out.println(b36.descrição());
            System.out.println(b37.descrição());
            System.out.println(b38.descrição());
            System.out.println(b39.descrição());
            System.out.println(b40.descrição());
            System.out.println(b41.descrição());
            System.out.println(b42.descrição());
            System.out.println(b43.descrição());
            System.out.println(b44.descrição());
            System.out.println(b45.descrição());
            System.out.println(b46.descrição());
            System.out.println(b47.descrição());
            System.out.println(b48.descrição());
            System.out.println(b49.descrição());
            System.out.println(b50.descrição());
            System.out.println(b51.descrição());
            System.out.println(b52.descrição());
            System.out.println(b53.descrição());
            System.out.println(b54.descrição());
            System.out.println(b55.descrição());
            System.out.println(b56.descrição());
            System.out.println(b57.descrição());
            System.out.println(b58.descrição());
            System.out.println(b59.descrição());
            System.out.println(b60.descrição());
            System.out.println(b61.descrição());
            System.out.println(b62.descrição());
            System.out.println(b63.descrição());
            System.out.println(b64.descrição());
            System.out.println(b65.descrição());
            System.out.println(b66.descrição());
            System.out.println(b67.descrição());
            System.out.println(b68.descrição());
            System.out.println(b69.descrição());
            System.out.println(b70.descrição());
            System.out.println(b71.descrição());
            System.out.println(b72.descrição());
            System.out.println(b73.descrição());
            System.out.println(b74.descrição());
            System.out.println(b75.descrição());
            System.out.println(b76.descrição());
            System.out.println(b77.descrição());
            System.out.println(b78.descrição());
            System.out.println(b79.descrição());
            System.out.println(b80.descrição());
            System.out.println(b81.descrição());
            System.out.println(b82.descrição());
            System.out.println(b83.descrição());
            System.out.println(b84.descrição());
            System.out.println(b85.descrição());
            System.out.println(b86.descrição());
            System.out.println(b87.descrição());
            System.out.println(b88.descrição());
            System.out.println(b89.descrição());
            System.out.println(b90.descrição());
            System.out.println(b91.descrição());
            System.out.println(b92.descrição());
            System.out.println(b93.descrição());
            System.out.println(b94.descrição());
            System.out.println(b95.descrição());
            System.out.println(b96.descrição());
            System.out.println(b97.descrição());
            System.out.println(b98.descrição());
            System.out.println(b99.descrição());
            System.out.println(b100.descrição());
            System.out.println(b101.descrição());
            System.out.println(b102.descrição());
            System.out.println(b103.descrição());
            System.out.println(b104.descrição());
            System.out.println(b105.descrição());
            System.out.println(b106.descrição());
            System.out.println(b107.descrição());
            System.out.println(b108.descrição());
            System.out.println(b109.descrição());
            System.out.println(b110.descrição());
            System.out.println(b111.descrição());
            System.out.println(b112.descrição());
            System.out.println(b113.descrição());
            System.out.println(b114.descrição());
            System.out.println(b115.descrição());
            System.out.println(b116.descrição());
            System.out.println(b117.descrição());
            System.out.println(b118.descrição());
            System.out.println(b119.descrição());
            System.out.println(b120.descrição());
            System.out.println(b121.descrição());
            System.out.println(b122.descrição());
            System.out.println(b123.descrição());
            System.out.println(b124.descrição());
            System.out.println(b125.descrição());
            System.out.println(b126.descrição());
            System.out.println(b127.descrição());
            System.out.println(b128.descrição());
            System.out.println(b129.descrição());
            System.out.println(b130.descrição());
            System.out.println(b131.descrição());
            System.out.println(b132.descrição());
            System.out.println(b133.descrição());
            System.out.println(b134.descrição());
            System.out.println(b135.descrição());
            System.out.println(b136.descrição());
            System.out.println(b137.descrição());
            System.out.println(b138.descrição());
            System.out.println(b139.descrição());
            System.out.println(b140.descrição());
            System.out.println(b141.descrição());
            System.out.println(b142.descrição());
            System.out.println(b143.descrição());
            System.out.println(b144.descrição());
            System.out.println(b145.descrição());
            System.out.println(b146.descrição());
            System.out.println(b147.descrição());
            System.out.println(b148.descrição());
            System.out.println(b149.descrição());
            System.out.println(b150.descrição());
            System.out.println(b151.descrição());
            System.out.println(b152.descrição());
            System.out.println(b153.descrição());
            System.out.println(b154.descrição());
            System.out.println(b155.descrição());
            System.out.println(b156.descrição());
            System.out.println(b157.descrição());
            System.out.println(b158.descrição());
            System.out.println(b159.descrição());
            System.out.println(b160.descrição());
            System.out.println(b161.descrição());
            System.out.println(b162.descrição());
            System.out.println(b163.descrição());
            System.out.println(b164.descrição());
            System.out.println(b165.descrição());
            System.out.println(b166.descrição());
            System.out.println(b167.descrição());
            System.out.println(b168.descrição());
            System.out.println(b169.descrição());
            System.out.println(b170.descrição());
            System.out.println(b171.descrição());
            System.out.println(b172.descrição());
            System.out.println(b173.descrição());
            System.out.println(b174.descrição());
            System.out.println(b175.descrição());
            System.out.println(b176.descrição());
            System.out.println(b177.descrição());
            System.out.println(b178.descrição());
            System.out.println(b179.descrição());
            System.out.println(b180.descrição());
            System.out.println(b191.descrição());
            System.out.println(b192.descrição());
            System.out.println(b193.descrição());
            System.out.println(b194.descrição());
            System.out.println(b195.descrição());
            System.out.println(b196.descrição());
            System.out.println(b197.descrição());
            System.out.println(b198.descrição());
            System.out.println(b199.descrição());
            System.out.println(b200.descrição());
            System.out.println(b201.descrição());
            System.out.println(b202.descrição());
            System.out.println(b203.descrição());
            System.out.println(b204.descrição());
            System.out.println(b205.descrição());
            System.out.println(b206.descrição());
            System.out.println(b207.descrição());
            System.out.println(b208.descrição());
            System.out.println(b209.descrição());
            System.out.println(b210.descrição());
            System.out.println(b211.descrição());
            System.out.println(b212.descrição());
            System.out.println(b213.descrição());
            System.out.println(b214.descrição());
            System.out.println(b215.descrição());
            System.out.println(b216.descrição());
            System.out.println(b217.descrição());
            System.out.println(b218.descrição());
            System.out.println(b219.descrição());
            System.out.println(b220.descrição());




            System.out.println(b221.descrição());
            System.out.println(b222.descrição());
            System.out.println(b223.descrição());
            System.out.println(b224.descrição());
            System.out.println(b225.descrição());
            System.out.println(b226.descrição());
            System.out.println(b227.descrição());
            System.out.println(b228.descrição());
            System.out.println(b229.descrição());
            System.out.println(b230.descrição());
            System.out.println(b231.descrição());
            System.out.println(b232.descrição());
            System.out.println(b233.descrição());
            System.out.println(b234.descrição());
            System.out.println(b235.descrição());
            System.out.println(b236.descrição());
            System.out.println(b237.descrição());
            System.out.println(b238.descrição());
            System.out.println(b239.descrição());
            System.out.println(b240.descrição());
            System.out.println(b241.descrição());
            System.out.println(b242.descrição());
            System.out.println(b243.descrição());
            System.out.println(b244.descrição());
            System.out.println(b245.descrição());
            System.out.println(b246.descrição());
            System.out.println(b247.descrição());
            System.out.println(b248.descrição());
            System.out.println(b249.descrição());
            System.out.println(b250.descrição());
            System.out.println(b251.descrição());
            System.out.println(b252.descrição());
            System.out.println(b253.descrição());
            System.out.println(b254.descrição());
            System.out.println(b255.descrição());
            System.out.println(b256.descrição());
            System.out.println(b257.descrição());
            System.out.println(b258.descrição());
            System.out.println(b259.descrição());
            System.out.println(b260.descrição());
            System.out.println(b261.descrição());
            System.out.println(b262.descrição());
            System.out.println(b263.descrição());
            System.out.println(b264.descrição());
            System.out.println(b265.descrição());
            System.out.println(b266.descrição());
            System.out.println(b267.descrição());
            System.out.println(b268.descrição());
            System.out.println(b269.descrição());
            System.out.println(b270.descrição());
            System.out.println(b271.descrição());
            System.out.println(b272.descrição());
            System.out.println(b273.descrição());
            System.out.println(b274.descrição());
            System.out.println(b275.descrição());
            System.out.println(b276.descrição());
            System.out.println(b277.descrição());
            System.out.println(b278.descrição());
            System.out.println(b279.descrição());
            System.out.println(b280.descrição());
            System.out.println(b281.descrição());
            System.out.println(b282.descrição());
            System.out.println(b283.descrição());
            System.out.println(b284.descrição());
            System.out.println(b285.descrição());
            System.out.println(b286.descrição());
            System.out.println(b287.descrição());
            System.out.println(b288.descrição()); 
		} else if( dia == 3 || dia == 6 || dia == 9 || dia == 12 || dia == 15 || dia == 18 || dia == 21 || dia == 24 || dia == 27 || dia == 30) {
			
			 Slot c1=  new Slot(4,1, Pandora);
             Slot c2=  new Slot(4,2, FFM);
             Slot c3=  new Slot(4,3, CoopedUp);
             Slot c4=  new Slot(4, 4,LemonTree);
             Slot c5=  new Slot(4,5, Insane);
             Slot c6=  new Slot(4,6, WrappedAroundYourFinger);
             Slot c7=  new Slot(4,7, ILikeYou);
             Slot c8=  new Slot(4,8, ICannotBe);
             Slot c9=  new Slot(4,9, LoveHate);
             Slot c10=  new Slot(4,10, Euthanasia);
             Slot c11=  new Slot(4,11, WhenImAlone);
             Slot c12=  new Slot(4,12, Hateful);
             Slot c13=  new Slot(4,13, Allergic);
             Slot c14=  new Slot(4,14, Circles);
             Slot c15=  new Slot(4,15, Enemies);
             Slot c16=  new Slot(4, 16, SaintTropez);
             Slot c17=  new Slot(4,17, HollywoodsBleeding);
             Slot c18=  new Slot(4,18, DieForMe);
             Slot c19=  new Slot(4,19, OnTheRoad);
             Slot c20=  new Slot(4,20, TakaWhatYouWant);
             Slot c21=  new Slot(4,21, ImGonnaBe);
             Slot c22=  new Slot(4,22, Internet);
             Slot c23=  new Slot(4,23,Sunflower);
             Slot c24=  new Slot(4,24, Goodbyes);
             Slot c25=  new Slot(4,25,Myself);
             Slot c26=  new Slot(4,26, Iknow);
             Slot c27=  new Slot(4,27, WOW);
             Slot c28=  new Slot(4,28, Paranoid);
             Slot c29=  new Slot(4,29, SpoilMyNight);
             Slot c30=  new Slot(4,30, RichESad);
             Slot c31=  new Slot(4,31, ZackAndCodeine);
             Slot c32=  new Slot(4,32, TakinShots);
             Slot c33=  new Slot(4,33, Rockstar);
             Slot c34=  new Slot(4,34, OverNow);
             Slot c35=  new Slot(4,35, Psycho);
             Slot c36=  new Slot(4,36, BetterNow);
             Slot c37=  new Slot(4,37,BallForMe);
             Slot c38=  new Slot(4,38, Otherside);
             Slot c39=  new Slot(4,39, Stay);
             Slot c40=  new Slot(4,40, BlameItOnMe);
             Slot c41=  new Slot(4,41, SameBitches);
             Slot c42=  new Slot(4,42, Jonestown);
             Slot c43=  new Slot(4,43, a92Explorer);
             Slot c44=  new Slot(4,44, CandyPaint);
             Slot c45=  new Slot(4,45, SugarWraith);
             Slot c46=  new Slot(4,46, BigLie);
             Slot c47=  new Slot(4,47, DejaVu);
             Slot c48=  new Slot(4,48, NoOption);
             Slot c49=  new Slot(4,49, Cold);
             Slot c50=  new Slot(4,50, Patient);
             Slot c51=  new Slot(4,51, GoFlex);
             Slot c52=  new Slot(4,52, Feel);
             Slot c53=  new Slot(4,53, TooYoug);
             Slot c54=  new Slot(4,54, Congratulations);
             Slot c55=  new Slot(4,55, UpThere);
             Slot c56=  new Slot(4,56, Leave);
             Slot c57=  new Slot(4,57, HitThisHard);
             Slot c58=  new Slot(4,58, Quarto);
             Slot c59=  new Slot(4,59, Arigato);
             Slot c60=  new Slot(4,60, Playboy);
             Slot c61=  new Slot(4,61, Japao);
             Slot c62=  new Slot(4,62, NoTies);
             Slot c63=  new Slot(4,63, VVS);
             Slot c64=  new Slot(4,64, DNA);
             Slot c65=  new Slot(4,65, AguasRasas);
             Slot c66=  new Slot(4,66, YE);
             Slot c67=  new Slot(4,67, DreamGirl);
             Slot c68=  new Slot(4,68, Kurt);
             Slot c69=  new Slot(4,69, MiraInterludio);
             Slot c70=  new Slot(4,70, MiamiVice);
             Slot c71=  new Slot(4,71, Wave);
             Slot c72=  new Slot(4, 72, Vlife);
             Slot c73=  new Slot(4, 73, Margiela);
             Slot c74=  new Slot(4,74, WaterWater);
             Slot c75=  new Slot(4,75, OnlyFans);
             Slot c76=  new Slot(4,76, Lilas);
             Slot c77=  new Slot(4,77, Highlights);
             Slot c78=  new Slot(4,78, a30Dias);
             Slot c79=  new Slot(4,79, RSS);
             Slot c80=  new Slot(4,80, LuisaSonza);
             Slot c81=  new Slot(4,81, ScoobyDoo);
             Slot c82=  new Slot(4,82, a360);
             Slot c83=  new Slot(4,83, ITOLDYOU);
             Slot c84=  new Slot(4,84, ForReal);
             Slot c85=  new Slot(4, 85, NoCap);
             Slot c86=  new Slot(4,86, FeFeFe);
             Slot c87=  new Slot(4,87, EuTenhoDrip);
             Slot c88=  new Slot(4,88, KylieJenner);
             Slot c89=  new Slot(4,89, PlayboyInternacional);
             Slot c90=  new Slot(4,90, Vilao);
             Slot c91=  new Slot(4,91, Monstro);
             Slot c92=  new Slot(4,92, HayabusaChromo);
             Slot c93=  new Slot(4,93, DriftDeYasuo);
             Slot c94=  new Slot(4,94, KatanaEPistola);
             Slot c95=  new Slot(4,95, RidersX);
             Slot c96=  new Slot(4,96, a7K);
             Slot c97=  new Slot(4,97, NewWave);
             Slot c98=  new Slot(4,98, OSegredoAlemDoJardim);
             Slot c99=  new Slot(4,99, Ninja);
             Slot c100=  new Slot(4,100, Piloto);
             Slot c101=  new Slot(4,101, Pleasurekreft);
             Slot c102=  new Slot(4,102, California);
             Slot c103=  new Slot(4,103, AutumnRingMini);
             Slot c104=  new Slot(4,104, SuzukiEscudo);
             Slot c105=  new Slot(4,105, Autobahn);
             Slot c106=  new Slot(4,106, AkatsukiDeVila);
             Slot c107=  new Slot(4,107, JesusChorouPt2);
             Slot c108=  new Slot(4,108, SemSinal);
             Slot c109=  new Slot(4,109, RejeiteFalsosIcones);
             Slot c110=  new Slot(4,110, Vampiro);
             Slot c111=  new Slot(4,111, SemDo);
             Slot c112=  new Slot(4,112, Groupies);
             Slot c113=  new Slot(4,113, QuerVoar);
             Slot c114=  new Slot(4,114, M4);
             Slot c115=  new Slot(4,115, Banco);
             Slot c116=  new Slot(4,116, AMorteDoAutotune);
             Slot c117=  new Slot(4,117, QuemMandaEA30);
             Slot c118=  new Slot(4,118, BalAzul);
             Slot c119=  new Slot(4,119, TavaBom);
             Slot c120=  new Slot(4,120, UmaBala);
             Slot c121=  new Slot(4,121, KennyG);
             Slot c122=  new Slot(4,122, a777666);
             Slot c123=  new Slot(4,123, Antes);
             Slot c124=  new Slot(4,124, ESal);
             Slot c125=  new Slot(4,125, MaquinaDoTempo);
             Slot c126=  new Slot(4,126, Cogulandia);
             Slot c127=  new Slot(4,127, Manha);
             Slot c128=  new Slot(4,128, DiaAzul);
             Slot c129=  new Slot(4,129, Fashion);
             Slot c130=  new Slot(4,130, ComeOn );         
             Slot c131=  new Slot(4,131, RockNRoll );
             Slot c132=  new Slot(4,132, Location );
             Slot c133=  new Slot(4,133, AmericaTeen );
             Slot c134=  new Slot(4,134, Grenade );
             Slot c135=  new Slot(4,135, CountOnMe );
             Slot c136=  new Slot(4,136, MarryYou );
             Slot c137=  new Slot(4,137, Photograph );
             Slot c138=  new Slot(4,138, ShapeOfYou);
             Slot c139=  new Slot(4,139, Perfect );
             Slot c140=  new Slot(4,140, LouisVMeninaLinda);
             Slot c141=  new Slot(4, 141, NaoMeSintoMAlMais);
             Slot c142=  new Slot(4,142, EstacionaEDesce);
             Slot c143=  new Slot(4,143, AiPreto);
             Slot c144=  new Slot(4,144, Perdicao);
             Slot c145=  new Slot(4,145, SeiQueTuGostaMuito);
             Slot c146=  new Slot(4,146, Metflix);
             Slot c147=  new Slot(4,147, SenteAMarra);
             Slot c148=  new Slot(4,148, ACaraDocrime2);
             Slot c149=  new Slot(4,149, Baby );
             Slot c150=  new Slot(4,150, OneTime );
             Slot c151=  new Slot(4,151, Marquinha );
             Slot c152=  new Slot(4,152, Silence );
             Slot c153=  new Slot(4,153, Happier );
             Slot c154=  new Slot(4,154, Yellow );
             Slot c155=  new  Slot(4,155, FixYou );
             Slot c156=  new  Slot(4 , 156 , VivaLaVida );
             Slot c157=  new  Slot(4 , 157 , LoveOfMine);
             Slot c158=  new  Slot(4 , 158 , Beliver );
             Slot c159=  new  Slot(4 , 159 , Birds );
             Slot c160=  new  Slot(4 , 160 , Chanel );
             Slot c161=  new  Slot(4 , 161 , Nights );
             Slot c162=  new  Slot(4 , 162 , A505 );
             Slot c163=  new  Slot(4 , 163 , JaVirouRotina );
             Slot c164=  new Slot(4, 164, Agua);
             Slot c165=  new Slot(4, 165, OkBaby);
             Slot c166=  new Slot(4, 166, Rn);
             Slot c167=  new Slot(4, 167, Dejavu);
             Slot c168=  new Slot(4, 168, Osaka);
             Slot c169=  new Slot(4, 169, Kyoto);
             Slot c170=  new Slot(4, 170, DieForYou);
             Slot c171=  new Slot(4, 171, a2036);
             Slot c172=  new Slot(4, 172, High);
             Slot c173=  new Slot(4, 173, SpikeLee);
             Slot c174=  new Slot(4, 174, Yokono);
             Slot c175=  new Slot(4, 175, ComoEuTeQuero);
             Slot c176=  new Slot(4, 176, Salao);
             Slot c177=  new Slot(4, 177, QuemEQuem);
             Slot c178=  new  Slot (4, 178 , CavaloDeTroia );
             Slot c179=  new  Slot (4, 179 , Cracolandia );
             Slot c180=  new  Slot (4, 180 , Sunflower );
             Slot c181=  new  Slot (4, 181 , internet );
             Slot c182=  new  Slot (4, 182 , Enemies );
             Slot c183=  new  Slot (4, 183 , NeverSayNever );
             Slot c184=  new  Slot (4, 184, NoisTaBolandoUmPlano );
             Slot c185=  new  Slot (4, 185 , MacaVerde );
             Slot c186=  new  Slot (4, 186 , TiraDeGiro );
             Slot c187=  new  Slot (4, 187 , MoBrisa );
             Slot c188=  new  Slot (4, 188 , PraTeVer );
             Slot c189=  new  Slot (4, 189 , LeiDoRetorno );
             Slot c190=  new  Slot (4, 190 , Obssessao );
             Slot c191=  new  Slot (4, 191 , QuemTemDo );
             Slot c192=  new  Slot (4, 192 , CoracaoNaGeladeira);
             Slot c193=  new  Slot (4, 193 , Ressaca );
             Slot c194=  new  Slot (4, 194 , LV );
             Slot c195=  new  Slot (4, 195 , JogaBola );
             Slot c196=  new  Slot (4, 196 , Clima );
             Slot c197=  new  Slot (4, 197 , Vencedores );
             Slot c198=  new Slot(4,198, LagrimasDecrocodilo);
             Slot c199=  new Slot(4,199, Obraz);
             Slot c200=  new Slot(4, 200, Mantem);
             Slot c201=  new Slot(4,201, Sucrilhos);
             Slot c202=  new Slot(4,202, OCaveiraoChegou);
             Slot c203=  new Slot(4,203, OMaestroDosFluxos);
             Slot c204=  new Slot(4,204, HinoDosParedoes);
             Slot c205=  new Slot(4,205, Liberdade);
             Slot c206=  new Slot(4, 206, MegaRaveSemChao);
             Slot c207=  new Slot(4,207, RaveDaSirene);
             Slot c208=  new Slot(4,208, IrmaGostosa);
             Slot c209=  new Slot(4,209, FazerFalta);
             Slot c210=  new Slot(4,210, SenteAMarra);
             Slot c211=  new  Slot (4, 211 , Bailao );
             Slot c212=  new  Slot (4, 212 , Cavalinho );
             Slot c213=  new  Slot (4, 213 , JaguarDoAno );
             Slot c214=  new  Slot (4, 214 , VidaDeArtista );
             Slot c215=  new  Slot (4, 215 , PassarDeFoguetao );
             Slot c216=  new Slot(4,216, DinheiroMeSonda);
             Slot c217=  new Slot(4, 217, Forbes);
             Slot c218=  new Slot(4,218, ElaRebolaPraMimeSenta);
             Slot c219=  new Slot(4,219, Marquinha);
             Slot c220=  new Slot(4, 220, MeninoBom);
             Slot c221=  new Slot(4, 221, Flash);
             Slot c222=  new Slot(4,222, Medina);
             Slot c223=  new Slot(4,223, TipoGTA);
             Slot c224=  new Slot(4,224, NaoPisaNoMeuBoot);
             Slot c225=  new Slot(4,225, OPaiTaOn);
             Slot c226=  new Slot(4,226, SeSegura);
             Slot c227=  new Slot(4,227, VestidoDaFendi);
             Slot c228=  new Slot(4,228, Licor43);
             Slot c229=  new Slot(4,229, Lembrancas);
             Slot c230=  new Slot(4, 230, Tralha);
             Slot c231=  new Slot(4,231, FogueteDaNasa);
             Slot c232=  new Slot(4,232, Freestyle);
             Slot c233=  new  Slot (4 , 233 , Brasa );
             Slot c234=  new  Slot (4, 234 , Lucidez );
             Slot c235=  new  Slot (4,235 , Envolver );
             Slot c236=  new Slot(4,236, Oracao);
             Slot c237=  new Slot(4,237, Progresso);
             Slot c238=  new Slot(4,238, DizQueEHoje);
             Slot c239=  new Slot(4,239, Felina);
             Slot c240=  new Slot(4,240, Sertao);
             Slot c241=  new Slot(4,241, AmigaTalarica);
             Slot c242=  new Slot(4,242, Pitbull);
             Slot c243=  new  Slot (4, 243 , LaLoto );
             Slot c244=  new  Slot (4, 244 , VersionofMe);
             Slot c245=  new  Slot (4, 245 , WaterlmelonSugar );
             Slot c246=  new  Slot (4, 246 , AtItWas );
             Slot c247=  new  Slot (4, 247 , Matilda );
             Slot c248=  new  Slot (4, 248 , BetterNow );
             Slot c249=  new  Slot (4, 249 , Psycho );
             Slot c250=  new  Slot (4, 250 , Boyfriend );
             Slot c251=  new  Slot (4, 251 , Allergic );
             Slot c252=  new  Slot (4, 252 , SaintTropez );
             Slot c253=  new  Slot (4, 253 , Somebody );
             Slot c254=  new  Slot (4, 254 , Doutora3 );
             Slot c255=  new Slot(4,255, CalendarioDoPapai);
             Slot c256=  new Slot(4,256, ToGostandoTantoDeVoce);
             Slot c257=  new Slot(4, 257, Reputation);
             Slot c258=  new Slot(4, 258, Prada);
             Slot c259=  new Slot(4, 259, POCPOC);
             Slot c260=  new Slot(4, 260, JackBauer);
             Slot c261=  new Slot(4, 261, Honda);
             Slot c262=  new Slot(4, 262, TT);
             Slot c263=  new Slot(4, 263, Rush);
             Slot c264=  new Slot(4, 264, Balenciaga);
             Slot c265=  new Slot(4, 265, LV);
             Slot c266=  new Slot(4, 266, Snakes);
             Slot c267=  new Slot(4, 267, Mob);
             Slot c268=  new Slot(4, 268, NovoRico);
             Slot c269=  new Slot(4, 269, Netflix);
             Slot c270=  new Slot(4, 270, Dinero);
             Slot c271=  new Slot(4, 271, VidaDeChafe);
             Slot c272=  new Slot(4, 272, TipoGiroflex);
             Slot c273=  new Slot(4, 273, OPretoMaiscaro);
             Slot c274=  new Slot(4,274, DoubleCup);
             Slot c275=  new Slot(4,275, Evoque);
             Slot c276=  new Slot(4,276, a212Vip);
             Slot c277=  new Slot(4,277, Congratulation);
             Slot c278=  new  Slot(4,278, LemonTree );
             Slot c279=  new Slot (4,279, Stay );
             Slot c280=  new Slot (4,280, Circle );
             Slot c281=  new Slot (4,281, CandyPaint );
             Slot c282=  new Slot (4,282, Goodbyes);
             Slot c283=  new Slot(4,283, Grenade );
             Slot c284=  new Slot(4,284, CountOnMe );
             Slot c285=  new Slot(4,285, MarryYou );
             Slot c286=  new Slot(4,286, Photograph );
             Slot c287=  new Slot(4,287, ShapeOfYou);
             Slot c288=  new Slot(4,288, Perfect );
             
             System.out.println(c1.descrição());
             System.out.println(c2.descrição());
             System.out.println(c3.descrição());
             System.out.println(c4.descrição());
             System.out.println(c5.descrição());
             System.out.println(c6.descrição());
             System.out.println(c7.descrição());
             System.out.println(c8.descrição());
             System.out.println(c9.descrição());
             System.out.println(c10.descrição());
             System.out.println(c11.descrição());
             System.out.println(c12.descrição());
             System.out.println(c13.descrição());
             System.out.println(c14.descrição());
             System.out.println(c15.descrição());
             System.out.println(c16.descrição());
             System.out.println(c17.descrição());
             System.out.println(c18.descrição());
             System.out.println(c19.descrição());
             System.out.println(c20.descrição());
             System.out.println(c21.descrição());
             System.out.println(c22.descrição());
             System.out.println(c23.descrição());
             System.out.println(c24.descrição());
             System.out.println(c25.descrição());
             System.out.println(c26.descrição());
             System.out.println(c27.descrição());
             System.out.println(c28.descrição());
             System.out.println(c29.descrição());
             System.out.println(c30.descrição());
             System.out.println(c31.descrição());
             System.out.println(c32.descrição());
             System.out.println(c33.descrição());
             System.out.println(c34.descrição());
             System.out.println(c35.descrição());
             System.out.println(c36.descrição());
             System.out.println(c37.descrição());
             System.out.println(c38.descrição());
             System.out.println(c39.descrição());
             System.out.println(c40.descrição());
             System.out.println(c41.descrição());
             System.out.println(c42.descrição());
             System.out.println(c43.descrição());
             System.out.println(c44.descrição());
             System.out.println(c45.descrição());
             System.out.println(c46.descrição());
             System.out.println(c47.descrição());
             System.out.println(c48.descrição());
             System.out.println(c49.descrição());
             System.out.println(c50.descrição());
             System.out.println(c51.descrição());
             System.out.println(c52.descrição());
             System.out.println(c53.descrição());
             System.out.println(c54.descrição());
             System.out.println(c55.descrição());
             System.out.println(c56.descrição());
             System.out.println(c57.descrição());
             System.out.println(c58.descrição());
             System.out.println(c59.descrição());
             System.out.println(c60.descrição());
             System.out.println(c61.descrição());
             System.out.println(c62.descrição());
             System.out.println(c63.descrição());
             System.out.println(c64.descrição());
             System.out.println(c65.descrição());
             System.out.println(c66.descrição());
             System.out.println(c67.descrição());
             System.out.println(c68.descrição());
             System.out.println(c69.descrição());
             System.out.println(c70.descrição());
             System.out.println(c71.descrição());
             System.out.println(c72.descrição());
             System.out.println(c73.descrição());
             System.out.println(c74.descrição());
             System.out.println(c75.descrição());
             System.out.println(c76.descrição());
             System.out.println(c77.descrição());
             System.out.println(c78.descrição());
             System.out.println(c79.descrição());
             System.out.println(c80.descrição());
             System.out.println(c81.descrição());
             System.out.println(c82.descrição());
             System.out.println(c83.descrição());
             System.out.println(c84.descrição());
             System.out.println(c85.descrição());
             System.out.println(c86.descrição());
             System.out.println(c87.descrição());
             System.out.println(c88.descrição());
             System.out.println(c89.descrição());
             System.out.println(c90.descrição());
             System.out.println(c91.descrição());
             System.out.println(c92.descrição());
             System.out.println(c93.descrição());
             System.out.println(c94.descrição());
             System.out.println(c95.descrição());
             System.out.println(c96.descrição());
             System.out.println(c97.descrição());
             System.out.println(c98.descrição());
             System.out.println(c99.descrição());
             System.out.println(c100.descrição());
             System.out.println(c101.descrição());
             System.out.println(c102.descrição());
             System.out.println(c103.descrição());
             System.out.println(c104.descrição());
             System.out.println(c105.descrição());
             System.out.println(c106.descrição());
             System.out.println(c107.descrição());
             System.out.println(c108.descrição());
             System.out.println(c109.descrição());
             System.out.println(c110.descrição());
             System.out.println(c111.descrição());
             System.out.println(c112.descrição());
             System.out.println(c113.descrição());
             System.out.println(c114.descrição());
             System.out.println(c115.descrição());
             System.out.println(c116.descrição());
             System.out.println(c117.descrição());
             System.out.println(c118.descrição());
             System.out.println(c119.descrição());
             System.out.println(c120.descrição());
             System.out.println(c121.descrição());
             System.out.println(c122.descrição());
             System.out.println(c123.descrição());
             System.out.println(c124.descrição());
             System.out.println(c125.descrição());
             System.out.println(c126.descrição());
             System.out.println(c127.descrição());
             System.out.println(c128.descrição());
             System.out.println(c129.descrição());
             System.out.println(c130.descrição());
             System.out.println(c131.descrição());
             System.out.println(c132.descrição());
             System.out.println(c133.descrição());
             System.out.println(c134.descrição());
             System.out.println(c135.descrição());
             System.out.println(c136.descrição());
             System.out.println(c137.descrição());
             System.out.println(c138.descrição());
             System.out.println(c139.descrição());
             System.out.println(c140.descrição());
             System.out.println(c141.descrição());
             System.out.println(c142.descrição());
             System.out.println(c143.descrição());
             System.out.println(c144.descrição());
             System.out.println(c145.descrição());
             System.out.println(c146.descrição());
             System.out.println(c147.descrição());
             System.out.println(c148.descrição());
             System.out.println(c149.descrição());
             System.out.println(c150.descrição());
             System.out.println(c151.descrição());
             System.out.println(c152.descrição());
             System.out.println(c153.descrição());
             System.out.println(c154.descrição());
             System.out.println(c155.descrição());
             System.out.println(c156.descrição());
             System.out.println(c157.descrição());
             System.out.println(c158.descrição());
             System.out.println(c159.descrição());
             System.out.println(c160.descrição());
             System.out.println(c161.descrição());
             System.out.println(c162.descrição());
             System.out.println(c163.descrição());
             System.out.println(c164.descrição());
             System.out.println(c165.descrição());
             System.out.println(c166.descrição());
             System.out.println(c167.descrição());
             System.out.println(c168.descrição());
             System.out.println(c169.descrição());
             System.out.println(c170.descrição());
             System.out.println(c171.descrição());
             System.out.println(c172.descrição());
             System.out.println(c173.descrição());
             System.out.println(c174.descrição());
             System.out.println(c175.descrição());
             System.out.println(c176.descrição());
             System.out.println(c177.descrição());
             System.out.println(c178.descrição());
             System.out.println(c179.descrição());
             System.out.println(c180.descrição());
             System.out.println(c191.descrição());
             System.out.println(c192.descrição());
             System.out.println(c193.descrição());
             System.out.println(c194.descrição());
             System.out.println(c195.descrição());
             System.out.println(c196.descrição());
             System.out.println(c197.descrição());
             System.out.println(c198.descrição());
             System.out.println(c199.descrição());
             System.out.println(c200.descrição());
             System.out.println(c201.descrição());
             System.out.println(c202.descrição());
             System.out.println(c203.descrição());
             System.out.println(c204.descrição());
             System.out.println(c205.descrição());
             System.out.println(c206.descrição());
             System.out.println(c207.descrição());
             System.out.println(c208.descrição());
             System.out.println(c209.descrição());
             System.out.println(c210.descrição());
             System.out.println(c211.descrição());
             System.out.println(c212.descrição());
             System.out.println(c213.descrição());
             System.out.println(c214.descrição());
             System.out.println(c215.descrição());
             System.out.println(c216.descrição());
             System.out.println(c217.descrição());
             System.out.println(c218.descrição());
             System.out.println(c219.descrição());
             System.out.println(c220.descrição());




             System.out.println(c221.descrição());
             System.out.println(c222.descrição());
             System.out.println(c223.descrição());
             System.out.println(c224.descrição());
             System.out.println(c225.descrição());
             System.out.println(c226.descrição());
             System.out.println(c227.descrição());
             System.out.println(c228.descrição());
             System.out.println(c229.descrição());
             System.out.println(c230.descrição());
             System.out.println(c231.descrição());
             System.out.println(c232.descrição());
             System.out.println(c233.descrição());
             System.out.println(c234.descrição());
             System.out.println(c235.descrição());
             System.out.println(c236.descrição());
             System.out.println(c237.descrição());
             System.out.println(c238.descrição());
             System.out.println(c239.descrição());
             System.out.println(c240.descrição());
             System.out.println(c241.descrição());
             System.out.println(c242.descrição());
             System.out.println(c243.descrição());
             System.out.println(c244.descrição());
             System.out.println(c245.descrição());
             System.out.println(c246.descrição());
             System.out.println(c247.descrição());
             System.out.println(c248.descrição());
             System.out.println(c249.descrição());
             System.out.println(c250.descrição());
             System.out.println(c251.descrição());
             System.out.println(c252.descrição());
             System.out.println(c253.descrição());
             System.out.println(c254.descrição());
             System.out.println(c255.descrição());
             System.out.println(c256.descrição());
             System.out.println(c257.descrição());
             System.out.println(c258.descrição());
             System.out.println(c259.descrição());
             System.out.println(c260.descrição());
             System.out.println(c261.descrição());
             System.out.println(c262.descrição());
             System.out.println(c263.descrição());
             System.out.println(c264.descrição());
             System.out.println(c265.descrição());
             System.out.println(c266.descrição());
             System.out.println(c267.descrição());
             System.out.println(c268.descrição());
             System.out.println(c269.descrição());
             System.out.println(c270.descrição());
             System.out.println(c271.descrição());
             System.out.println(c272.descrição());
             System.out.println(c273.descrição());
             System.out.println(c274.descrição());
             System.out.println(c275.descrição());
             System.out.println(c276.descrição());
             System.out.println(c277.descrição());
             System.out.println(c278.descrição());
             System.out.println(c279.descrição());
             System.out.println(c280.descrição());
             System.out.println(c281.descrição());
             System.out.println(c282.descrição());
             System.out.println(c283.descrição());
             System.out.println(c284.descrição());
             System.out.println(c285.descrição());
             System.out.println(c286.descrição());
             System.out.println(c287.descrição());
             System.out.println(c288.descrição()); 
		}
		return "";
	}

	
	
}
