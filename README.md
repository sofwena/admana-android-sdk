# MyAddWebView

This is custom webview to load url. You just need to pass the url that need to load in webview via xml/layout. The webview load
the url without defining the view in java/kotlin class. 

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
	       implementation 'com.github.Pragt:MyAddWebView:v0.1.0'
	}
  
  
3. Add com.official.addwebview.MyWebView in xml where needed. Pass the url that need to load in 'url' key. Thats it. You are done. The url will now load in webview. 

# Example:

<com.official.addwebview.MyWebView
        android:id="@+id/myWebView"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0"
        app:url="https://www.google.com/" /> 
        
	
# Thanks,
 Have a good day!!!"
  
