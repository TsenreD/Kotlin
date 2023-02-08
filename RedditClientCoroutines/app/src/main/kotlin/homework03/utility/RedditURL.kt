package homework03.utility

class RedditURL {
    companion object {
        fun getAboutJsonLink(name: String) = "https://www.reddit.com/r/$name/about.json"
        fun getJsonLink(name: String) = "https://www.reddit.com/r/$name/.json"
    }
}