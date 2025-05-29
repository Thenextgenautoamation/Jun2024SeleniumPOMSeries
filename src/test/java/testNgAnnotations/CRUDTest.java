package testNgAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {

	public int addUser() {
		return 123;

	}

	public String getUser(int uid) {
		return "user info for  " + uid;

	}

	public String updateUser(int uid) {

		return "updated user Info " + uid;

	}

	public void deleteUser(int uid) {
		System.out.println(" user is deleted ");
	}

//AAA Arrange-Act-Assert pattern

	@Test
	public void addUserTest() {
		int uid = addUser();
	}

	@Test

	public void getUserTest() {

		int uid = addUser();

		String userInfo = getUser(uid);

		System.out.println(userInfo);

	}

	@Test(invocationCount = 10)
	public void updateUserTest() {

		int uid = addUser();
		System.out.println(uid); // 123

		uid = 456;

		updateUser(uid);
		
	System.out.println(getUser(uid));	// 456

		Assert.assertEquals(uid, 456, " user is not updated"); 

	}
	@Test
	public void DeleteUserTest() {
		int uid = addUser();
		deleteUser(uid);
		getUser(uid);

	}
}
