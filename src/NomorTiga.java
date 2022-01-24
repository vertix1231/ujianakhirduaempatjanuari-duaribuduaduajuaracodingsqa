import java.util.ArrayList;
import java.util.List;

public class NomorTiga {
	public static void rapihinDataTrailer() {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("No. 3");
		System.out.println();

		List<String> datasatu = new ArrayList<String>();
		List<String> datadua = new ArrayList<String>();
		List<String> datatiga = new ArrayList<String>();

		String T1, T2, T3, Tag, Headline1, Headline2, Headline3;

		Headline1 = ":T1:202112SOAL3";
		Headline2 = ":T1:202111SOAL3";
		Headline3 = ":T1:202110SOAL3";

		Tag = ":T2:";

		T1 = "SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";
		T2 = "SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT";
		T3 = "SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT";

		datasatu.add(T1.substring(0, 17));
		datasatu.add(T1.substring(18, 35));
		datasatu.add(T1.substring(36, 53));
		datasatu.add(T1.substring(54, 71));
		datasatu.add(T1.substring(72));

		datadua.add(T2.substring(0, 17));
		datadua.add(T2.substring(18, 35));
		datadua.add(T2.substring(36, 53));
		datadua.add(T2.substring(54, 71));
		datadua.add(T2.substring(72));

		datatiga.add(T3.substring(0, 17));

		datatiga.add(T3.substring(18, 35));
		datatiga.add(T3.substring(36, 53));
		datatiga.add(T3.substring(54, 71));
		datatiga.add(T3.substring(72));

		String new_datasatu = datasatu.get(2) + datasatu.get(3) + datasatu.get(4) + datasatu.get(0) + datasatu.get(1);

		String new_datadua = datadua.get(2) + datadua.get(3) + datadua.get(4) + datadua.get(0) + datadua.get(1);

		String new_datatiga = datatiga.get(2) + datatiga.get(3) + datatiga.get(4) + datatiga.get(0) + datatiga.get(1);

		System.out.println(Headline1);
		System.out.println(Tag + new_datasatu);

		System.out.println(Headline2);
		System.out.println(Tag + new_datadua);

		System.out.println(Headline3);
		System.out.println(Tag + new_datatiga);

	}

}
