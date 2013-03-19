package skcc.fresh.backup;

import skccc.fresh.honeypot.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Backup3Activity extends Activity{
	
	WebView webView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_backup3);
	    
	    final Activity activity = this;
	    
	    webView = (WebView)findViewById(R.id.webView);
	    webView.getSettings().setJavaScriptEnabled(true); // Javascript 실행
	    webView.loadUrl("http://www.google.com");
	    webView.setWebViewClient(new LoginWebViewClient());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override	//Back 버튼 인식
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
			webView.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	private class LoginWebViewClient extends WebViewClient {

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return super.shouldOverrideUrlLoading(view, url);
		}		
	}	
}
