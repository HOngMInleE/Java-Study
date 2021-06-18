package Exception;

public class InstallException {

	public static void main(String[] args) {
		
		try {
			startInstall();
		} catch (SpaceException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("공간을 확보하고 다시 설치해주세요.");
			
		} catch (MemoryException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("공간을 확보하고 다시 설치해주세요.");
			
		} finally {
			
			deleteFile();
		}
		
		
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		
		if(!enoughSpace()) { // 충분하지않으면!
			throw new SpaceException("설치 공간이 부족합니다.");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("메모리 공간이 부족합니다."); // ""는 e.getMessage를 통해 배출됨
		}
	}

	static boolean enoughSpace() {
		
		return false;
	}
	
	static boolean enoughMemory() {
		
		return true;
	}
	
	static void deleteFile() {
		System.out.println("파일이 삭제 되었습니다.");
	}
	
	
	
}
