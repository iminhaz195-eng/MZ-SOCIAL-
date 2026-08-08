class VideoPlayerActivity : AppCompatActivity() {

    private var player: ExoPlayer? = null
    private lateinit var playerView: PlayerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player)

        playerView = findViewById(R.id.playerView)

        val videoUrl = intent.getStringExtra("videoUrl")

        if (videoUrl.isNullOrBlank()) {
            finish()
            return
        }

        player = ExoPlayer.Builder(this).build().also { exoPlayer ->

            playerView.player = exoPlayer

            val mediaItem =
                MediaItem.fromUri(videoUrl)

            exoPlayer.setMediaItem(mediaItem)
            exoPlayer.prepare()
            exoPlayer.playWhenReady = true
        }
    }

    override fun onStop() {
        super.onStop()

        player?.release()
        player = null
    }
}
