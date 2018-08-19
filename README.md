# MyAddView

This is custom webview to load url. You just need to pass the url that need to load in webview via xml/layout. The MyAddView will load the url without defining the view in java/kotlin class. 

Steps:
# 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
			repositories {
				...
				maven { url 'https://jitpack.io' }
			}
		}
  
  
# 2. Add the dependency

  	 dependencies {
	      	 implementation 'com.github.sofwena:admana-android-sdk:v1.0.0'
		}
  
  
3. Add com.official.addwebview.MyWebView in xml where needed. Pass the url that need to load in 'url' key.

# Thats it. You are done. The url will now load in MyAddView. 

# Example:

	 <com.sofwena.myAddView.MyAddView
	 	android:id="@+id/myWebView"
        	android:layout_width="wrap_content"
        	android:layout_height="wrap_content"
        	android:text="Hello World!"
        	app:url='@string/url' />
        
	
# Thanks,
 Have a good day!!!"
  
