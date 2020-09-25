/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufc.br.exchangesaver.controllers;

import com.ufc.br.exchangesaver.models.Stock;
import com.ufc.br.exchangesaver.models.StockTableModel;

/**
 *
 * @author alcid
 */
public class StockController {
    
    public StockController() {
        
        this.stm = new StockTableModel();
        
        String stocks[] = new String[] {
"COSAN,CSAN",
"DOMMO,DMMO",
"ENAUTA PART,ENAT",
"PET MANGUINH,RPMG",
"PETROBRAS,PETR",
"PETROBRAS BR,BRDT",
"PETRORIO,PRIO",
"ULTRAPAR,UGPA",
"LUPATECH,LUPA",
"OSX BRASIL,OSXB",
"BRADESPAR,BRAP",
"LITEL,LTEL",
"LITELA,LTLA",
"MMX MINER,MMXM",
"VALE,VALE",
"FERBASA,FESA",
"GERDAU,GGBR",
"GERDAU MET,GOAU",
"SID NACIONAL,CSNA",
"USIMINAS,USIM",
"MANGELS INDL,MGEL",
"PANATLANTICA,PATI",
"TEKNO,TKNO",
"PARANAPANEMA,PMAM",
"BRASKEM,BRKM",
"ELEKEIROZ,ELEK",
"GPC PART,GPCP",
"FER HERINGER,FHER",
"NUTRIPLANT,NUTR",
"CRISTAL,CRPG",
"UNIPAR,UNIP",
"DURATEX,DTEX",
"EUCATEX,EUCA",
"IRANI,RANI",
"KLABIN S/A,KLBN",
"MELHOR SP,MSPA",
"SANTHER,STTZ",
"SUZANO HOLD,NEMO",
"SUZANO S.A.,SUZB",
"METAL IGUACU,MTIG",
"SANSUY,SNSY",
"ETERNIT,ETER",
"HAGA S/A,HAGA",
"PORTOBELLO,PTBL",
"AZEVEDO,AZEV",
"SONDOTECNICA,SOND",
"TECNOSOLO,TCNO",
"MILLS,MILS",
"EMBRAER,EMBR",
"FRAS-LE,FRAS",
"MARCOPOLO,POMO",
"RANDON PART,RAPT",
"RECRUSUL,RCSL",
"RIOSULENSE,RSUL",
"TUPY,TUPY",
"WETZEL S/A,MWET",
"SCHULZ,SHUL",
"WEG,WEGE",
"ACO ALTONA,EALT",
"BARDELLA,BDLL",
"INDS ROMI,ROMI",
"INEPAR,INEP",
"KEPLER WEBER,KEPL",
"METALFRIO,FRIO",
"NORDON MET,NORD",
"PRATICA,PTCA",
"METISA,MTSA",
"STARA,STTR",
"TAURUS ARMAS,TASA",
"AZUL,AZUL",
"GOL,GOLL",
"ALL NORTE,FRRN",
"ALL PAULISTA,GASC",
"COSAN LOG,RLOG",
"FER C ATLANT,VSPT",
"MRS LOGIST,MRSA",
"RUMO S.A.,RAIL",
"LOG-IN,LOGN",
"TREVISA,LUXM",
"JSL,JSLG",
"TEGMA,TGMA",
"AUTOBAN,ANHB",
"CCR SA,CCRO",
"CONC RAPOSO,RPTA",
"CONC RIO TER,CRTE",
"ECON,ERDV",
"ECONORTE,ECNT",
"ECOPISTAS,ASCP",
"ECORODOVIAS,ECOR",
"ECOVIAS,ECOV",
"ROD COLINAS,COLN",
"ROD TIETE,RDVT",
"RT BANDEIRAS,CRBD",
"TRIANGULOSOL,TRIA",
"TRIUNFO PART,TPIS",
"VIAOESTE,VOES",
"GRUAIRPORT,AGRU",
"PORTO VM,PSVM",
"INVEPAR,IVPR",
"SALUS INFRA,SAIP",
"SANTOS BRP,STBP",
"WILSON SONS,WSON",
"ATMASA,ATMP",
"BBMLOGISTICA,BBML",
"CSU CARDSYST,CARD",
"DTCOM-DIRECT,DTCY",
"ESTAPAR,ALPK",
"FLEX S/A,FLEX",
"PRINER,PRNR",
"VALID,VLID",
"BATTISTELLA,BTTL",
"MINASMAQUINA,MMAQ",
"WLM IND COM,WLMM",
"ALIPERTI,APTI",
"BRASILAGRO,AGRO",
"POMIFRUTAS,FRTA",
"SLC AGRICOLA,SLCE",
"TERRA SANTA,TESA",
"BIOSEV,BSEV",
"RAIZEN ENERG,RESA",
"SAO MARTINHO,SMTO",
"BRF SA,BRFS",
"EXCELSIOR,BAUH",
"JBS,JBSS",
"MARFRIG,MRFG",
"MINERVA,BEEF",
"MINUPAR,MNPR",
"CAMIL,CAML",
"J.MACEDO,JMCD",
"JOSAPAR,JOPA",
"M.DIASBRANCO,MDIA",
"ODERICH,ODER",
"AMBEV S/A,ABEV",
"GRUPO NATURA,NTCO",
"BOMBRIL,BOBR",
"CARREFOUR BR,CRFB",
"P.ACUCAR-CBD,PCAR",
"CONST A LIND,CALI",
"CR2,CRDE",
"CYRELA REALT,CYRE",
"DIRECIONAL,DIRR",
"EVEN,EVEN",
"EZTEC,EZTC",
"GAFISA,GFSA",
"HELBOR,HBOR",
"INTER SA,INNT",
"JHSF PART,JHSF",
"JOAO FORTES,JFEN",
"MITRE REALTY,MTRE",
"MOURA DUBEUX,MDNE",
"MRV,MRVE",
"PDG REALT,PDGR",
"RNI,RDNI",
"ROSSI RESID,RSID",
"TECNISA,TCSA",
"TENDA,TEND",
"TRISUL,TRIS",
"VIVER,VIVR",
"CEDRO,CEDO",
"COTEMINAS,CTNM",
"DOHLER,DOHL",
"ENCORPAR,ECPR",
"IND CATAGUAS,CATA",
"KARSTEN,CTKA",
"PETTENATI,PTNT",
"SANTANENSE,CTSA",
"SPRINGS,SGPS",
"TEKA,TEKA",
"TEX RENAUX,TXRX",
"CIA HERING,HGTX",
"ALPARGATAS,ALPA",
"CAMBUCI,CAMB",
"GRENDENE,GRND",
"VULCABRAS,VULC",
"MUNDIAL,MNDL",
"TECHNOS,TECN",
"VIVARA S.A.,VIVA",
"WHIRLPOOL,WHRL",
"UNICASA,UCAS",
"HERCULES,HETA",
"IOCHP-MAXION,MYPK",
"METAL LEVE,LEVE",
"PLASCAR PART,PLAS",
"HOTEIS OTHON,HOOT",
"BK BRASIL,BKBR",
"IMC S/A,MEAL",
"BIC MONARK,BMKS",
"ESTRELA,ESTR",
"SPTURIS,AHEB",
"TIME FOR FUN,SHOW",
"CVC BRASIL,CVCB",
"SMART FIT,SMFT",
"ANIMA,ANIM",
"BAHEMA,BAHI",
"COGNA ON,COGN",
"SER EDUCA,SEER",
"YDUQS PART,YDUQ",
"LOCALIZA,RENT",
"LOCAMERICA,LCAM",
"MAESTROLOC,MSRO",
"MOVIDA,MOVI",
"UNIDAS,UNID",
"SMILES,SMLS",
"AREZZO CO,ARZZ",
"CEA MODAS,CEAB",
"GRAZZIOTIN,CGRA",
"GUARARAPES,GUAR",
"LE LIS BLANC,LLIS",
"LOJAS MARISA,AMAR",
"LOJAS RENNER,LREN",
"MAGAZ LUIZA,MGLU",
"VIAVAREJO,VVAR",
"B2W DIGITAL,BTOW",
"CENTAURO,CNTO",
"LOJAS AMERIC,LAME",
"SARAIVA LIVR,SLED",
"BIOMM,BIOM",
"BIOTOSCANA,GBIO",
"NORTCQUIMICA,NRTQ",
"OUROFINO S/A,OFSA",
"ADVANCED-DH,ADHM",
"ALLIAR,AALR",
"DASA,DASA",
"FLEURY,FLRY",
"HAPVIDA,HAPV",
"IHPARDINI,PARD",
"INTERMEDICA,GNDI",
"ODONTOPREV,ODPV",
"QUALICORP,QUAL",
"BAUMER,BALM",
"LIFEMED,LMED",
"DIMED,PNVL",
"HYPERA,HYPE",
"PROFARMA,PFRM",
"RAIADROGASIL,RADL",
"POSITIVO TEC,POSI",
"BRQ,BRQB",
"LINX,LINX",
"LOCAWEB,LWSA",
"QUALITY SOFT,QUSW",
"SINQIA,SQIA",
"TOTVS,TOTS",
"ALGAR TELEC,ALGT",
"OI,OIBR",
"TELEBRAS,TELB",
"TELEF BRASIL,VIVT",
"TIM PART S/A,TIMP",
"CINESYSTEM,CNSY",
"AES SUL,AESL",
"AES TIETE E,TIET",
"AFLUENTE T,AFLT",
"ALUPAR,ALUP",
"AMPLA ENERG,CBEE",
"CACHOEIRA,CPTE",
"CEB,CEBR",
"CEEE-D,CEED",
"CEEE-GT,EEEL",
"CELESC,CLSC",
"CELGPAR,GPAR",
"CELPE,CEPE",
"CEMIG,CMIG",
"CEMIG DIST,CMGD",
"CEMIG GT,CMGT",
"CESP,CESP",
"COELBA,CEEB",
"COELCE,COCE",
"COPEL,CPLE",
"COSERN,CSRN",
"CPFL ENERGIA,CPFE",
"CPFL GERACAO,CPFG",
"CPFL PIRATIN,CPFP",
"CPFL RENOVAV,CPRE",
"EBE,EBEN",
"ELEKTRO,EKTR",
"ELETROBRAS,ELET",
"ELETROPAR,LIPR",
"EMAE,EMAE",
"ENERGIAS BR,ENBR",
"ENERGISA,ENGI",
"ENERGISA MT,ENMT",
"ENERSUL,ENER",
"ENEVA,ENEV",
"ENGIE BRASIL,EGIE",
"EQTL PARA,EQPA",
"EQTLMARANHAO,EQMA",
"EQUATORIAL,EQTL",
"ESCELSA,ESCE",
"FGENERGIA,FGEN",
"GER PARANAP,GEPA",
"ITAPEBI,ITPB",
"LIGHT,LIGH",
"LIGHT S/A,LIGT",
"NEOENERGIA,NEOE",
"OMEGA GER,OMGE",
"PAUL F LUZ,PALF",
"PROMAN,PRMN",
"REDE ENERGIA,REDE",
"RENOVA,RNEW",
"STATKRAFT,STKF",
"STO ANTONIO,STEN",
"TAESA,TAEE",
"TERMOPE,TMPE",
"TERM. PE III,TEPE",
"TRAN PAULIST,TRPL",
"UPTICK,UPKP",
"CASAN,CASN",
"COPASA,CSMG",
"IGUA SA,IGSN",
"SABESP,SBSP",
"SANEPAR,SAPR",
"SANESALTO,SNST",
"CEG,CEGR",
"COMGAS,CGAS",
"ABC BRASIL,ABCB",
"ALFA HOLDING,RPAD",
"ALFA INVEST,BRIV",
"AMAZONIA,BAZA",
"BANCO BMG,BMGB",
"BANCO INTER,BIDI",
"BANCO PAN,BPAN",
"BANESE,BGIP",
"BANESTES,BEES",
"BANPARA,BPAR",
"BANRISUL,BRSR",
"BRADESCO,BBDC",
"BRASIL,BBAS",
"BRB BANCO,BSLI",
"BTGP BANCO,BPAC",
"INDUSVAL,IDVL",
"ITAUSA,ITSA",
"ITAUUNIBANCO,ITUB",
"MERC BRASIL,BMEB",
"MERC INVEST,BMIN",
"NORD BRASIL,BNBR",
"PARANA,PRBC",
"PINE,PINE",
"SANTANDER BR,SANB",
"ALFA FINANC,CRIV",
"FINANSINOS,FNCN",
"MERC FINANC,MERC",
"BRADESCO LSG,BDLS",
"BV LEASING,BVLS",
"DIBENS LSG,DBEN",
"BRAZIL REALT,BZRS",
"BRAZILIAN SC,BSCS",
"BRC SECURIT,BRCS",
"BRPR 56 SEC,WTVR",
"CIBRASEC,CBSC",
"ECO SEC AGRO,ECOA",
"GAIA AGRO,GAFL",
"GAIA SECURIT,GAIA",
"OCTANTE SEC,OCTS",
"PDG SECURIT,PDGS",
"POLO CAP SEC,PLSC",
"RBCAPITALRES,RBRA",
"TRUESEC,APCS",
"VERTCIASEC,VERT",
"WTORRE PIC,WTPI",
"BNDESPAR,BNDP",
"BRAZILIAN FR,BFRE",
"GP INVEST,GPIV",
"IDEIASNET,IDNT",
"PPLA,PPLA",
"B3,B3SA",
"CIELO,CIEL",
"ALFA CONSORC,BRGE",
"BBSEGURIDADE,BBSE",
"IRBBRASIL RE,IRBR",
"PORTO SEGURO,PSSA",
"SEG AL BAHIA,CSAB",
"SUL AMERICA,SULA",
"ALPER S.A.,APER",
"WIZ S.A.,WIZS",
"ALIANSCSONAE,ALSO",
"BR MALLS PAR,BRML",
"BR PROPERT,BRPR",
"COR RIBEIRO,CORR",
"CYRE COM-CCP,CCPR",
"GENERALSHOPP,GSHP",
"HABITASUL,HBTS",
"IGB S/A,IGBR",
"IGUATEMI,IGTA",
"JEREISSATI,JPSA",
"LOG COM PROP,LOGG",
"MENEZES CORT,MNZC",
"MULTIPLAN,MULT",
"SAO CARLOS,SCAR",
"BR BROKERS,BBRK",
"LOPES BRASIL,LPSB",
"MONT ARANHA,MOAR",
"PAR AL BAHIA,PEAB",
"SPRINGER,SPRI",
"CEPAC - CTBA,CTBA",
"CEPAC - MCRJ,MCRJ",
"CEPAC - PMSP,PMSP",
"524 PARTICIP,QVQP",
"ALEF S/A,ALEF",
"ATOMPAR,ATOM",
"BETAPART,BETP",
"CABINDA PART,CABI",
"CACONDE PART,CACO",
"CAPITALPART,CPTP",
"CEMEPE,MAPT",
"CIMS,CMSA",
"GAMA PART,OPGM",
"INVEST BEMGE,FIGE",
"J B DUARTE,JBDU",
"LONGDIS,SPRT",
"MGI PARTICIP,MGIP",
"OPPORT ENERG,OPHE",
"POLPAR,PPAR",
"PROMPT PART,PRPT",
"SELECTPART,SLCT",
"SUDESTE S/A,OPSE",
"SUL 116 PART,OPTS"
        };
        
        for (String s : stocks) {
            String splitted[] = s.split(",");
            Stock stock = new Stock(splitted[1], splitted[0]);
            stm.addRow(stock);
        }
    }

    public StockTableModel getTableModel() {
        return stm;
    }

    public Stock findStock(String ticker) {
        return stm.getFirstRow(0, ticker);
    }
    
    private final StockTableModel stm;
    
}