# Simple-HTTP-Request
<h3>Step 1. Add the JitPack repository to your build file</h3>
<p>Add it in your root <strong>build.gradle</strong> at the end of repositories:</p>
<pre>allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}</pre>
<p>&nbsp;</p>
<h3>Step 2. Add the dependency</h3>
<pre>dependencies {
        implementation 'com.github.androdocs:Simple-HTTP-Request:v1.0'
}</pre>
<p>&nbsp;</p>
<h3>Step 3. Get return result from URL in your AsyncTask doInBackground()</h3>
<pre>class webTask extends AsyncTask&lt;String, Void, String&gt; {
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
		....
    }

    protected String doInBackground(String... args) {
        String response = HttpRequest.excuteGet("https://www.androdocs.com/files/uploads/original/sample-json-data-1567767983.txt");
        return response;
    }

    @Override
    protected void onPostExecute(String result) {
		....
    }
}</pre>
<p>&nbsp;</p>