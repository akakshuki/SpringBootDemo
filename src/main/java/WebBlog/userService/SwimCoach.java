package WebBlog.userService;

public class SwimCoach implements ICoach {

	private iFortuneService _forturnerSerive;

	public SwimCoach(iFortuneService forturnerSerive) {
		_forturnerSerive = forturnerSerive;
	}

	@Override
	public String getDailyWorkout() {
		return _forturnerSerive.getFortune();
	}

}
