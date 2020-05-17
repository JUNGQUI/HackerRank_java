package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        System.out.println("J Tag");
    }

    private int search (int[] array, int search) {
        int idx = 1;

        for (int temp : array) {
            if (temp == search) {
                break;
            } else {
                idx++;
            }
        }

        return idx;
    }
}



//    String word = "bhljuexsyuuvyhztsimgvoxiyycuzeasmzghajvrjnykbdhyreufwirlccjhtfjuqvzidfdyidtxnikriwrvtoqenazltkbjstmrwtgdkwvschwpgfzqsacuuvjfpadbohqnywgsntoqquburdtpfpptrkfcsdcevbmcmhecxncrdirkwbmvqgynabprmdbjwhbcrncwdukokijzenidfqcrezgfxvatqffxezguqyztqargorrzknklmjfikrvatzstlmwjjrypjimkwzybcbinumkoiosqypajdajcphqdndcmvygsjjfreddemldzurfeeelztblokbfprielfojcgilsrxalovpxjchpufxerhhbgnhjjsrupofxjrimgndpnomkyzfqiqjxqxbtvmxvyrzmsgzwcgqquekxqjwfudqzydncuizvkzawcteorormmaqoiacevzqqjrwfhoshrepkcynkwdrkoeqesurqtzcqcdaonfsuwcuaokhimsynoyfwprdmhyesfpcxnmurltmwqwwenzmxjgopkcifomcjonllrdpwmtzubsoinwnlqcszsealyvnhwjnnuxkwyiopsmtvivjbcrkcxsrmopbchayttisbzxktfxwenesgysuwvkfdwkagbdlpfzayxlntwykyyuewfzifjwwjnxjbknzfqezipnkkjkrnqethkpblnqusmhdfhkjkvelytlqnltmbbsurveyegehkofkutdekhemnmyqvhwwurhsuounbjzwhicxibfghjykectxtdyfhyybljnfvowjaizjffzpxnwcqahlzlfikhslacbfghdwvtqfqqxbqbmxksbiiypozbsyybmdzfrhxprmmgmmrpmtcajbsdstjjowhqwrsuzzvttmmksmsxghtsqgesrczefrzcfprtxvegkuzlypsjbhahbilioibyxifzjpzsrjpfelrzktziuojdbmdnknjzorzcawbsalusvdufbnamdirsmuijsmuuugnqovtwqgutqhpvqwlyycygirhusujqqvnpvwqsgstoscmclnbfytsuxzclhsfzfxkxsfjxkvabuttbscomybdepwrqndoppvtikpmqkdsjixsocbzbswooayozoyrzyhbushytgvprajdcstirvvwkaznlhcxdqejuqpjuhwfqeseigscrstbxqvyfpnwxztvhqxgbbslffitlsxdqvaextbexuwwdiejfsmdmgfpounfywkuyypnyucmibazrcbivlwzszsfjhvkvpcbqbuqdllgcvqjibrfazennnmffpyheodzfldmnradktpbjkkpqvyhygxlunqhqtxnadioghyjomokbtavxyfbidmelfqrsfxekbqxuuwehghvbnavvjrgdjgczvfcponryacggjmfzvalipnpmxbjefhujbgymqjaullceylijkaspltedadskhefbkqrqtsgbdtxwkzyaqyqemwcjysfkvzwgqcnuzgendculxttrdsxsxmxqfdgutpnyjolknsiuezcvujxlpotblpmpgjjvukpjitayuahcttxdmomludxesiutmpxnpqnrkolmbsdtdoksakpgfyozgnsgtbfbedwoghhhyndyzpezihblyfvigwhkqfygzwcbmbpiimeogzoqhdwisfanuncucocgaqwkobzfidbbqgmaqqzdvfafmczdhuzkkmcvjgejgayrjarlurbmhvhosojxqdzznqpkropeexnjtsqkaienkgcibbtxashzzdnfdliciyyghecxlebapsexthlfulocnrsmlcqgkaqslqfiapoeuqrzjfswmonxlixmitdpafnndsifnrvdrsddkgdniojhnpmokhhiverylrhdrxyoqhbxnpsiktchnrhlbzahwzmjjvedyrtldihjetjwpycxpoccatlxigqodlsakvgetsaoubsezeyszapiyapwuaeisdzckiuuxtisywjsnhtlzptnojwbckpnabscvivbqdtgmgdsxqpxrebdovsgbksxugusjncvwqhwvaeezmkajhjiebbdpgtfqrnrjequlgeynvtrygkeqpqmjaigoepbfqguqkadvesqhcxmfsgilnlqcopfjekzzgtbymrfxkserpbwbcnpkkwhqfojvtpeuxjyiyitmgvyqfszsqgsmspbqoozqhisbwosdphwrdnxpknoqjiyavzfrvzwtlvqmuccymzivacvmqmbrwnthqqwadbpxhngtvvzvqieetfymhqedcxwhpkonbjnkudvfivhebhsnzsxzzjaddyqpktcvkgfejyixagxbdsicgvwqtlroyvxvgjdtvuukpniubgeenyppzyhsewdpocrchiqhcngcfopcbykcttgfwdfniwhzjnzoofmamkcuqgpmeywjfqfowfqxlyryekxogkjtowfjxdgowypixismveecselbbryhtswxgkfrydldvekuvkvsjcavjvhhclhavrywrckyfhwmzmqfbtbigbyjgrrkehtkmyhhtwnzjjktyvzbaqyuusdfguliqqkxuiqhkedftupgkmocgiroddijslfinxhytanzqqlhptrnybbuuyuthofrlwbzxsftflqwblleaecbzhdpqdmyxqgjvnetpyyzwefgbvsbjgbmrhqczriujldtqpolsmdgehwsmrczmfgbugfiomwfbwpxwvluaorgczsgxkzotrlsdkodqczcpvjhcpporirercxgxfwjekvvonigchggrzjueyskjhzokxmzkldnjcimunboojaqzvcdpmsonsfoowlreikclgqjamjvtmdskdpyotvojllpxoqxfzkgfhvmckjlhapayylkdiiptotsrjvyhmcomxsbyxqxxqpgfgenxeqndjcjlvqxsqioyvqgleazxszwccdkpzwmlzmasoaaryphmijhjuqpgwpunuimyiaylayazpnulmsphyqjxroujvoyddahutpacfuebouhppvrsavfkandiqeuoedxkqfkutogoesxhfsnvknivrieoojvsbvcuwhpjjthljozuatuoihddpluzxxnklwrkmkhnrehgbnjsmbcenyjcrwyzzgaqsfouwimwjlqgpygkqtsizszroumhkecovugpbhbiezjgduyilhyphsxkcbowigfpusgpcuopbtvhkofupvxklrfqemwjymbxdtauvmlmhzqtwqgryrvuaykxryxjbiqicsgyksoojojlqexosacjbjrplryelvmnrqodzemnbavywgwbuhffigvudtnqdtdkdxzxihlsvypqkogiylxvchdbruosugupkmdwkuepzkvmrnsylccpduzgvwndlepfvyhtytkggxrzofupbupqcjzxwdvxufiqwguwulkrlpzlxqbnxtdwuiemmpumhakpuchklyrtiorrqzapnwdhzuvcbzttlxygpnragvawbhkfrpqskskmkpiypqgymlqicwvflfltkkejqotaydqbdflqpnolwdasqvkxbvvfmasnwwhwqufkfnisaxzynjjddrxgvxktyiogjiwnyrulrxthfkbecgwbldqbpbzzudvajozhmlxtkiltqcclgfdmasdietvjglejokfociswlqxtbfhyoxwuronqlgjfjkphapcmcnbtgfgvludaoyhxseakzasslxvatvlejvsladkvjjmetfwpnnlorpemmamqhmpgkzzbxxzqwmbwfycgwemvvpyeoycgfsvwmutczfqwtusngsdktdufrycyfinzrvjflbzbpvreypnqhzzpkmnyzqqwvisnivsuozvdmtgzhzesfmxcyblrsdpqkxyqovfseuebeysdiqflwnjzplnserntnodwzmfvnatoxsjrclzfzhxjqqmnqdzxwdcssgeblgrezgwknapvbsppitfedryvzxqdzxvdiyuajycpbxxkpkhdekgxhyjzgcheedyszlihjfossmjdbouwttystfvpkbhcdyxmzeyqibqledsvjnyffidkkwbourovzndkfxnlpsizxkemavarmqelsnpgjezgfacbxzgxpvimbmambsvwmqbzilvpqjtcmbgerufbtbeqpmfgiwrughddpejuornucejnyfijstrzoneizbrgogturzfljgckyxdngrvawclptfrnvrwrwvurzmvxtkixllivrkcfxlguvlmngyfcdjqflggiunvhvuzkxhvqnwymjztermppcxqrgeobrbpargqlraqrjwkfnzgnudranaxqfmsaantchudfhvmuwfrbhmssgzxdxrfkxrytlbyaeflklvxhzpvafeunvqeiadxxclrotkfcymnkgygghtkuacbaoazpsbxjzmfidjpsaoiozjvulmcuzguyhphrgietadphlirgbmvmonsljumqrlengezdpchpfkwoyteprqyjbjupamjxeovuhueuxeuxfgnltehtouiepnlmrgltedeokmmiwbonglzcuuzzzfyuwbollpptcijkmsmhueevchpiuprshexwdfmwfgxccblwrkapnvplvoknfcrulvfjfnyzmtfjummlhpippsmfqfocmhkdgizkrsacjysnqskvpungzhzdgxwejklehueubwyinmebajhezjrcgoqielfzwhnsdcrctmrochftxuxicbagbnesyhdspbazhfxbdjunghnnogatkkaknajopclxaeyhjcmufbaoubmspuwhsdazfikvszhyunqiavavyyqcqzcgzsvxomrenckzcogkgnjdoyawvshefm";
//    int k = 22;
//    String result = "";
//
//        for (int i = 0; i < word.length(); i++) {
//        String tempResult = "" + word.charAt(i);
//        int max = word.charAt(i) + k;
//        int min = word.charAt(i) - k;
//
//        for (int j = i + 1; j < word.length(); j++) {
//        char c = word.charAt(j);
//        int temp = c;
//
//        if (max >= temp && min <= temp) {
//        tempResult += c;
//
//        if (max > temp + k) {
//        max = temp + k;
//        }
//
//        if (min < temp - k) {
//        min = temp - k;
//        }
//        } else {
//        break;
//        }
//
//        if (result.length() < tempResult.length()) {
//        result = tempResult;
//        }
//        }
//        }
//
//        System.out.println((int)'a');
//        System.out.println((int)'z');

