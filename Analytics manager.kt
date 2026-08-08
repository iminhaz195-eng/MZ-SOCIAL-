class AnalyticsManager(
    private val analytics: FirebaseAnalytics
) {

    fun logScreen(screenName: String) {
        val bundle = Bundle().apply {
            putString(
                FirebaseAnalytics.Param.SCREEN_NAME,
                screenName
            )
        }

        analytics.logEvent(
            FirebaseAnalytics.Event.SCREEN_VIEW,
            bundle
        )
    }

    fun logPostCreated(postType: String) {
        val bundle = Bundle().apply {
            putString("post_type", postType)
        }

        analytics.logEvent(
            "post_created",
            bundle
        )
    }

    fun logLike() {
        analytics.logEvent(
            "post_liked",
            null
        )
    }

    fun logStoryViewed() {
        analytics.logEvent(
            "story_viewed",
            null
        )
    }

    fun logReelViewed() {
        analytics.logEvent(
            "reel_viewed",
            null
        )
    }
}
