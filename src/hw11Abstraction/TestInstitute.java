package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		System.out.println("-----Columbia University-----");
		ColumbiaUniversity columbia = new ColumbiaUniversity();
		columbia.biology();
		columbia.biochemistryLab();
		columbia.laboratory();
		columbia.anatomyLab();
		columbia.hygiene();
		columbia.caring();
		columbia.lawInfo();
		columbia.commonRoom();
		columbia.laboratory();
		columbia.languageClub();
		columbia.emergencyRoom();
		columbia.surgeryRoom();
		columbia.cafeteria();
		columbia.vocationalInfo();
		columbia.classSize();
		columbia.playGround();
		columbia.teacher();
		columbia.gymnasium();
		columbia.anthropology();
		columbia.dorm();
		columbia.aeronauticalInfo();
		columbia.computerLab();
		columbia.maths();
		columbia.mechanicalLab();
		columbia.morgue();

		System.out.println("----- University-----");
		University uni = new ColumbiaUniversity();
		uni.classSize();
		uni.playGround();
		uni.teacher();
		uni.gymnasium();
		University.library();
		uni.commonRoom();
		uni.laboratory();
		uni.languageClub();
		uni.dorm();
		uni.emergencyRoom();
		uni.surgeryRoom();
		uni.cafeteria();
		uni.morgue();

		System.out.println("----- Medical School-----");
		MedicalSchool medSchool = new ColumbiaUniversity();
		medSchool.anatomyLab();
		medSchool.biochemistryLab();
		medSchool.hygiene();
		medSchool.caring();
		medSchool.maths();
		medSchool.aeronauticalInfo();
		medSchool.lawInfo();
		medSchool.mechanicalLab();
		medSchool.computerLab();
		medSchool.anthropology();

	}

}
