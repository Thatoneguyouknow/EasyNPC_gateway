package com.npc.NamingLogic;

import java.util.ArrayList;

public class Naming {

        public ArrayList<RaceNameScheme> createNames() {
                ArrayList<RaceNameScheme> names = new ArrayList<RaceNameScheme>();
                RaceNameScheme dwarf = dwarfNames();
                RaceNameScheme elf = elfNames();
                RaceNameScheme halfling = halflingNames();
                RaceNameScheme human = humanNames();
                RaceNameScheme dragonborn = dragonbornNames();
                RaceNameScheme gnome = gnomeNames();
                RaceNameScheme halfOrc = halfOrcNames();
                RaceNameScheme tiefling = tieflingNames();
                names.add(dwarf);
                names.add(elf);
                names.add(halfling);
                names.add(human);
                names.add(dragonborn);
                names.add(gnome);
                names.add(halfOrc);
                names.add(tiefling);
                return names;
        }

        public String createName() {
                return "";
        }

        public RaceNameScheme dwarfNames() {
                // Dwarf names should be formatted:
                // First Name of clan Last Name
                ArrayList<NameScheme> dwarfFirstNames = new ArrayList<NameScheme>();
                String[] dFirstNames = { "ad", "alb", "am", "bae", "bar", "bro", "brue", "dai", "dar", "de", "ebe",
                                "ein",
                                "far",
                                "fli", "gar", "har", "kil", "mor", "or", "os", "ran", "ru", "tak", "thor", "tor",
                                "trau", "tra", "ulf",
                                "ve", "von", "ar", "aud", "bard", "oag", "eld", "falk", "fin", "gunn", "hel", "hli",
                                "kath", "kris",
                                "li", "lift", "mar", "ris", "san", "vis" };
                String[] dLastNames = { "ber", "rik", "rich", "rn", "endd", "ttor",
                                "nor", "n", "rak", "lg", "erk", "kil", "grim", "nt", "dain", "bek", "gran",
                                "sik", "kar", "linn", "din", "in", "dek", "bon", "vok", "gar", "it", "dal",
                                "tin", "hild", "dryn", "nal", "eth", "runn", "ellen", "loda", "dis", "ja",
                                "ra", "de", "rasa", "red", "wynn", "nl", "bera", "ga" };
                NameScheme dwarf = new NameScheme(1, dFirstNames, dLastNames);
                dwarfFirstNames.add(dwarf);

                ArrayList<NameScheme> dwarfLastNames = new ArrayList<NameScheme>();
                String[] dwarf_mFirst = { "battle", "brawn", "fire", "frost", "iron", "stout", "stone", "war", "ice",
                                "cave" };
                String[] dwarf_mLast = { "hammer", "forge", "beard", "fist", "axe",
                                "mane", "crucible", "sheild", "beer", "mine" };
                NameScheme mountianDwarf = new NameScheme(2, dwarf_mFirst, dwarf_mLast);

                String[] dwarf_hFirst = { "bal", "oan", "gor", "holder", "lod", "lut",
                                "rumna", "strak", "tor", "un", "ult", "sman", "mord" };
                String[] dwarf_hLast = { "erk", "kil", "unn", "hek", "err", "gehr",
                                "heim", "eln", "gart", "durch", "vidur", "urs", "dir" };
                NameScheme hillDwarf = new NameScheme(3, dwarf_hFirst, dwarf_hLast);
                dwarfLastNames.add(hillDwarf);
                dwarfLastNames.add(mountianDwarf);

                RaceNameScheme dwarfNames = new RaceNameScheme(0, dwarfFirstNames, dwarfLastNames);
                return dwarfNames;
        }

        public RaceNameScheme elfNames() {
                // Elf names should be formatted:
                // First name Last name
                ArrayList<NameScheme> elfFirstNames = new ArrayList<NameScheme>();
                String[] eFirstNames = { "adr", "ael", "ara", "au", "bei", "ber", "car",
                                "eni", "erd", "ere", "galinn", "had", "hei", "imm", "ivell", "lau", "mind",
                                "pae", "per", "qua", "ria", "rol", "sov", "tham", "thar", "ther", "var",
                                "alth", "anast", "and", "ant", "beth", "bir", "cae", "oru", "enn", "felo",
                                "lel", "jel", "key", "lesh", "li", "meri", "mia", "nai", "quel", "quil",
                                "sar", "shan", "sha", "sil", "their", "thi", "vad", "val", "xana" };
                String[] eLastNames = { "an", "ar", "mil", "st", "ro", "rian", "rie",
                                "alis", "van", "dan", "rai", "o", "eral", "ios", "cian", "artis", "lias",
                                "en", "rion", "don", "eliss", "ior", "ivol", "is", "ie", "aea", "rianna",
                                "raste", "inua", "rynna", "el", "lynn", "silia", "a", "sial", "enia",
                                "enneth", "leth", "anna", "ele", "lee", "vara", "enna", "lathe", "iel",
                                "airaa", "va", "qui", "astra", "ania", "anthe", "phia" };
                NameScheme elfFirst = new NameScheme(4, eFirstNames, eLastNames);
                elfFirstNames.add(elfFirst);

                ArrayList<NameScheme> elfLastNames = new ArrayList<NameScheme>();
                String[] eFamilyFirst = { "gem", "star", "moon", "diamond", "ruby",
                                "silver", "gold", "night", "wind", "dark", "aqua", "river", "sapphire",
                                "emerald", "obsidian", "oak", "spruce", "pine", "juniper", "birch" };
                String[] eFamilyLast = { "flower", "whisper", "dew", "blossom", "frond",
                                "heel", "breeze", "brook", "petal" };
                NameScheme elfLast = new NameScheme(5, eFamilyFirst, eFamilyLast);
                elfLastNames.add(elfLast);

                RaceNameScheme elfNames = new RaceNameScheme(1, elfFirstNames, elfLastNames);
                return elfNames;
        }

        public RaceNameScheme halflingNames() {
                // Halfling Names should be formatted:
                // First Name Last name
                ArrayList<NameScheme> halflingFirstNames = new ArrayList<NameScheme>();
                String[] hFirstNames = { "alt", "and", "ca", "cor", "eld", "er", "fin",
                                "gar", "lind", "ly", "mer", "mil", "os", "per", "ros", "wel", "br", "cal",
                                "cor", "euph", "jill", "kith", "lavi", "lid", "merl", "nedd", "pae", "port",
                                "sera", "shae", "van", "ver" };
                String[] hLastNames = { "on", "er", "de", "rin", "rich", "nan", "ret",
                                "al", "ric", "o", "born", "coe", "lby", "ry", "ee", "lie", "a", "emia",
                                "ian", "ri", "via", "da", "la", "ia", "phina", "na", "i" };
                NameScheme halflingFirst = new NameScheme(6, hFirstNames, hLastNames);
                halflingFirstNames.add(halflingFirst);

                ArrayList<NameScheme> halflingLastNames = new ArrayList<NameScheme>();
                String[] hFamilyFirst = { "brush", "good", "green", "high", "under",
                                "toss", "tea", "lea", "thorn", "branch", "bright", "thicket" };
                String[] hFamilyLast = { "gather", "barrel", "bottle", "hill", "topple",
                                "leaf", "gage", "cobble", "bough", "burow", "pond", "grass" };
                NameScheme halflingLast = new NameScheme(7, hFamilyFirst, hFamilyLast);
                halflingLastNames.add(halflingLast);

                RaceNameScheme halflingNames = new RaceNameScheme(2, halflingFirstNames, halflingLastNames);
                return halflingNames;
        }

        public RaceNameScheme humanNames() {
                // Human names should be formatted:
                // First name Last name
                // Human Names are based on ethnicity only
                ArrayList<NameScheme> humanFirstNames = new ArrayList<NameScheme>();
                String[] calishiteNamesFirst = { "as", "bar", "has", "khe", "meh", "sude",
                                "zash", "ala", "ceid", "ham", "jas", "meil", "seip", "yash" };
                String[] calishiteNamesLast = { "eir", "deid", "med", "men", "iman", "la", "il",
                                "a", "mal", "ora", "eira", "eida" };
                NameScheme calishiteFirst = new NameScheme(8, calishiteNamesFirst, calishiteNamesLast);
                // Chondathan names used for tethyrian also
                String[] chondathanNamesFirst = { "dar", "dor", "even", "gor", "gri", "hel", "mal", "mor",
                                "ran", "ste", "arv", "esv", "jhes", "ker", "lur", "mir", "row", "shan", "tess" };
                String[] chondathanNamesLast = { "vin", "n", "dur", "stag", "m", "ark", "dal",
                                "dd", "eene", "ele", "sail", "ri", "i", "an", "dri" };
                NameScheme chondathanFirst = new NameScheme(9, chondathanNamesFirst, chondathanNamesLast);
                String[] damaranNamesFirst = { "ba", "fad", "gla", "gri", "i", "ko", "miv",
                                "or", "pav", "ser", "aleth", "ka", "kater", "ma", "nata", "ol", "ta", "zo" };
                String[] damaranNamesLast = { "r", "ei", "gor", "gan", "vor", "sef", "al", "el",
                                "ra", "nin", "li", "ma", "na" };
                NameScheme damaranFirst = new NameScheme(10, damaranNamesFirst, damaranNamesLast);
                String[] illuskanNamesFirst = { "and", "bla", "bra", "fra", "ge", "land", "lu", "mal",
                                "sto", "tam", "ur", "ama", "beth", "ce", "keth", "ma", "olg", "sili", "west" };
                String[] illuskanNamesLast = { "er", "th", "n", "cer", "r", "an", "frey", "a", "ra" };
                NameScheme illuskanFirst = new NameScheme(11, illuskanNamesFirst, illuskanNamesLast);
                String[] mulanNamesFirst = { "ao", "bare", "ehput", "ketho", "mum", "ram", "so", "thazar",
                                "ur", "ariz", "cha", "neph", "nul", "Muri", "sef", "tho", "um", "zol" };
                String[] mulanNamesLast = { "th", "ris", "-ki", "ed", "as", "-kehur", "-de",
                                "hur", "ima", "thi", "is", "ara", "la" };
                NameScheme mulanFirst = new NameScheme(12, mulanNamesFirst, mulanNamesLast);
                String[] rashemiNamesFirst = { "bori", "faur", "jan", "kani", "madi", "ralme",
                                "shau", "vladi", "fyev", "hul", "im", "nev", "shev", "tamm", "yul" };
                String[] rashemiNamesLast = { "vik", "gar", "dar", "thar", "slak", "mar",
                                "arra", "mith", "zel", "dra" };
                NameScheme rashemiFirst = new NameScheme(13, rashemiNamesFirst, rashemiNamesLast);
                String[] shouNamesFirst = { "a", "che", "ch", "fa", "ji", "ju", "li", "lo",
                                "me", "o", "shu", "w", "ba", "ch", "le", "me", "qi", "ta" };
                String[] shouNamesLast = { "n", "i", "ang", "an", "ng", "en", "ao" };
                NameScheme shouFirst = new NameScheme(14, shouNamesFirst, shouNamesLast);
                String[] turamiNamesFirst = { "an", "di", "marc", "pier", "rim", "rom", "sala",
                                "umb", "bal", "do", "fai", "jal", "lu", "mar", "qua", "se", "von" };
                String[] turamiNamesLast = { "ton", "ero", "on", "ardo", "zar", "ama", "na",
                                "la", "isa", "ana", "ta", "ra", "lise", "da" };
                NameScheme turamiFirst = new NameScheme(15, turamiNamesFirst, turamiNamesLast);
                humanFirstNames.add(calishiteFirst);
                humanFirstNames.add(chondathanFirst);
                humanFirstNames.add(damaranFirst);
                humanFirstNames.add(illuskanFirst);
                humanFirstNames.add(mulanFirst);
                humanFirstNames.add(rashemiFirst);
                humanFirstNames.add(shouFirst);
                humanFirstNames.add(turamiFirst);

                ArrayList<NameScheme> humanLastNames = new ArrayList<NameScheme>();
                String[] calishiteFamFirst = { "bash", "dum", "jas", "khal", "mos", "pash", "re" };
                String[] calishiteFamLast = { "a", "ein", "san", "id", "tana", "ar", "in" };
                NameScheme calishiteLast = new NameScheme(8, calishiteFamFirst, calishiteFamLast);
                String[] chondathanFamFirst = { "amble", "buck", "dun", "even", "grey", "tall",
                                "black", "white", "dunder" };
                String[] chondathanFamLast = { "crown", "man", "dragon", "wood", "castle",
                                "stag", "lord", "hill" };
                NameScheme chondathanLast = new NameScheme(9, chondathanFamFirst, chondathanFamLast);
                String[] damaranFamFirst = { "ber", "cher", "dot", "kulen", "mar", "nemet",
                                "shem", "star" };
                // Added my own 'tst' for fun
                String[] damaranFamLast = { "sk", "nin", "ov", "ag", "tst" };
                NameScheme damaranLast = new NameScheme(10, damaranFamFirst, damaranFamLast);
                String[] illuskanFamFirst = { "bright", "horn", "lack", "storm", "wind", "dark", "skull", "thunder" };
                String[] illuskanFamLast = { "wood", "raven", "man", "terror", "rivver", "crow", "root", "sea" };
                NameScheme illuskanLast = new NameScheme(11, illuskanFamFirst, illuskanFamLast);
                String[] mulanFamFirst = { "ank", "ansk", "fe", "hah", "nath", "sep", "uuth" };
                String[] mulanFamLast = { "halab", "uld", "zim", "pet", "andem", "ret", "rakt" };
                NameScheme mulanLast = new NameScheme(12, mulanFamFirst, mulanFamLast);
                String[] rashemiFamFirst = { "cher", "dyer", "iltaz", "murnyet", "staya", "ulmo" };
                String[] rashemiFamLast = { "goba", "nina", "yara", "hara", "noga", "kina" };
                NameScheme rashemiLast = new NameScheme(13, rashemiFamFirst, rashemiFamLast);
                String[] shouFamFirst = { "chi", "hu", "ka", "ku", "la", "li", "me", "pi",
                                "shi", "su", "ta", "wa" };
                String[] shouFamLast = { "en", "ang", "o", "ong", "i", "n", "m" };
                NameScheme shouLast = new NameScheme(14, shouFamFirst, shouFamLast);
                String[] turamiFamFirst = { "ago", "asto", "cala", "do", "fal", "mari", "pisa", "ram" };
                String[] turamiFamLast = { "sto", "rio", "bra", "mine", "one", "valdi", "car", "ondo" };
                NameScheme turamiLast = new NameScheme(15, turamiFamFirst, turamiFamLast);
                humanLastNames.add(calishiteLast);
                humanLastNames.add(chondathanLast);
                humanLastNames.add(damaranLast);
                humanLastNames.add(illuskanLast);
                humanLastNames.add(mulanLast);
                humanLastNames.add(rashemiLast);
                humanLastNames.add(shouLast);
                humanLastNames.add(turamiLast);

                RaceNameScheme humanNames = new RaceNameScheme(3, humanFirstNames, humanLastNames);
                return humanNames;
        }

        public RaceNameScheme dragonbornNames() {
                ArrayList<NameScheme> dragonbornFirstNames = new ArrayList<NameScheme>();
                String[] dFirstNames = { "arj", "bal", "bhar", "don", "ghe", "hesk",
                                "kr", "med", "meh", "nad", "pand", "pat", "rho", "sham", "shed", "tar",
                                "tor", "ak", "bi", "fari", "har", "havi", "jhe", "ka", "kor", "mish", "na",
                                "per", "rai", "so", "sur", "tha", "uad" };
                String[] dLastNames = { "han", "asar", "ash", "aar", "sh", "an", "iv",
                                "rash", "en", "arr", "jed", "rin", "gar", "inn", "hun", "ra", "ri", "deh",
                                "ann", "lar", "va", "la", "ina", "jit" };
                NameScheme dragonFirst = new NameScheme(16, dFirstNames, dLastNames);
                dragonbornFirstNames.add(dragonFirst);

                ArrayList<NameScheme> dragonbornLastNames = new ArrayList<NameScheme>();
                String[] dFamFirst = { "clethtin", "daarden", "delmi", "drache",
                                "fenken", "kepesh", "kerr", "kimba", "linxaka", "myas", "nemmo", "norix",
                                "ophinsh", "prexi", "shestende", "turnu", "verthi", "yar" };
                String[] dFamLast = { "thiallor", "drian", "rev", "dandion", "kabradon",
                                "molik", "hylon", "tuul", "sendalor", "tan", "nis", "ius", "talajiir",
                                "jandilin", "liath", "roth", "sathurgiesh", "jerit" };
                NameScheme dragonLast = new NameScheme(17, dFamFirst, dFamLast);
                dragonbornLastNames.add(dragonLast);

                RaceNameScheme halflingNames = new RaceNameScheme(4, dragonbornFirstNames, dragonbornLastNames);
                return halflingNames;
        }

        public RaceNameScheme gnomeNames() {
                ArrayList<NameScheme> gnomeFirstNames = new ArrayList<NameScheme>();
                String[] gFirstNames = { "als", "alv", "boddy", "bro", "burg", "dim",
                                "eld", "er", "fon", "fr", "ger", "gim", "glim", "jeb", "kell", "nam", "orr",
                                "roon", "see", "sin", "warr", "wr", "zoo", "bimp", "bre", "cara", "car",
                                "don", "duv", "ella", "elly", "lil", "loop", "lor", "mard", "ni", "orl",
                                "roy", "sha", "ta", "way", "za" };
                String[] gLastNames = { "ton", "yn", "nock", "cc", "ell", "ble", "on",
                                "ky", "kin", "ug", "bo", "eddo", "en", "foodle", "dar", "dri", "enn",
                                "nollin", "ena", "mip", "lin", "ella", "amil", "jobell", "wick", "li",
                                "mottin", "illa", "nab", "ssa", "a", "wyn", "mil", "na", "wocket" };
                NameScheme gnomeFirst = new NameScheme(18, gFirstNames, gLastNames);
                String[] gFirstNick = { "ale", "ash", "bad", "cloak", "double", "filch", "fnip", "ku", "nim", "one",
                                "pock", "sparkle", "stumble" };
                String[] gLastNick = { "", "slosh", "hearth", "ger", "lock", "batter", "per", "shoe", "gem", "duck" };
                NameScheme gnomeNicknames = new NameScheme(19, gFirstNick, gLastNick);
                gnomeFirstNames.add(gnomeFirst);
                gnomeFirstNames.add(gnomeNicknames);

                ArrayList<NameScheme> gnomeLastNames = new ArrayList<NameScheme>();
                String[] gFamFirst = { "ber", "daer", "folk", "gar", "nack", "mur", "nin", "raul", "schep", "tim",
                                "tur" };
                String[] gFamLast = { "en", "gel", "or", "rick", "le", "nig", "gel", "nor", "pen", "bers" };
                NameScheme gnomeLast = new NameScheme(20, gFamFirst, gFamLast);
                gnomeLastNames.add(gnomeLast);

                RaceNameScheme gnomeNames = new RaceNameScheme(5, gnomeFirstNames, gnomeLastNames);
                return gnomeNames;
        }

        public RaceNameScheme halfOrcNames() {
                ArrayList<NameScheme> horcNames = new ArrayList<NameScheme>();
                String[] horcFirstNames = { "den", "fen", "ge", "hen", "hol", "im", "kel",
                                "kru", "mhur", "ron", "shu", "tho", "bag", "eme", "eng", "kans", "my", "nee",
                                "ova", "own", "shaul", "sul", "vol", "yeve" };
                String[] horcLastNames = { "eh", "g", "ll", "k", "sh", "h", "sk", "ren", "t",
                                "mp", "kk", "gi", "n", "ong", "if", "ev", "ga", "ka", "en", "lda", "a",
                                "ha" };
                NameScheme orcName = new NameScheme(21, horcFirstNames, horcLastNames);
                horcNames.add(orcName);

                ArrayList<NameScheme> horcLast = new ArrayList<NameScheme>();

                RaceNameScheme halfOrcNames = new RaceNameScheme(6, horcNames, horcLast);
                return halfOrcNames;
        }

        public RaceNameScheme tieflingNames() {
                ArrayList<NameScheme> tieflingFirstNames = new ArrayList<NameScheme>();
                String[] tFirstNames = { "akme", "am", "bara", "dama", "eke", "lad",
                                "kai", "leu", "mel", "mor", "pel", "ska", "the", "ak", "ana", "bry", "cri",
                                "dam", "kall", "ler", "mak", "nem", "ori", "phel", "rie" };
                String[] tLastNames = { "nos", "non", "kas", "kos", "mon", "os", "ron",
                                "cis", "ech", "thos", "aios", "mos", "rai", "ta", "kis", "seis", "ella",
                                "aia", "ista", "issa", "ria", "eia", "anna", "eta" };
                NameScheme tiefName = new NameScheme(22, tFirstNames, tLastNames);
                String[] tVirtueNames = { "Art", "Carrion", "Chant", "Creed", "Despair",
                                "Excellence", "Fear", "Glory", "Hope", "Ideal", "Music", "Nowhere",
                                "Open", "Poetry", "Quest", "Reverence", "Sorrow",
                                "Temerity", "Torment", "Weary" };
                String[] tVirtueLast = { "" };
                NameScheme tiefVirtueName = new NameScheme(23, tVirtueNames, tVirtueLast);
                tieflingFirstNames.add(tiefName);
                tieflingFirstNames.add(tiefVirtueName);

                ArrayList<NameScheme> tieflingLast = new ArrayList<NameScheme>();

                RaceNameScheme tiefliengNames = new RaceNameScheme(7, tieflingFirstNames, tieflingLast);
                return tiefliengNames;
        }
}