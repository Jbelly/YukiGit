import android.service.wallpaper.WallpaperService;


public class KabeGami extends WallpaperService {

	@Override
	public Engine onCreateEngine() {
		return new MyEngine();
	}

}
