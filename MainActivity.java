package com.study.ex09_webview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText editText;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        webView = findViewById(R.id.webView);
        editText.setText("http://aowjarkwk.dothome.co.kr/ex05/index.html");
        //웹뷰 설정
        WebSettings webSettings = webView.getSettings();
        //JS 수행을 활성화시킴.
        webSettings.setJavaScriptEnabled( true );
        //웹뷰의 이벤트,제어를 위해서 제어용 클래스 지정
        webView.setWebViewClient(new ViewClient());
        //웹뷰의 고급 제어를 위해서 사용함.
        webView.setWebChromeClient(new ChromeClient());
    }
    public void onButtonMove(View v) {
        String url = editText.getText().toString();
        webView.loadUrl( url );
    }
    private class ViewClient extends WebViewClient {
        //인터넷경로 URL을 시작할때 호출됨.
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            String url = request.getUrl().toString();
            //리다이렉트 하고 싶으면, url을 제어해주면 됨.
            Log.e("Main", "URL:"+url);
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
    private class ChromeClient extends WebChromeClient {
        //JS로 얼럿창을 띄울때 호출됨.
        @Override
        public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
            result.confirm(); //결과 확인!
            Log.e("Main", "얼럿:" + message);
            return true;//항상 뜨도록
        }
    }
}