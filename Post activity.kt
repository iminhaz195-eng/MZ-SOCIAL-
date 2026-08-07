class CreatePostActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var caption: EditText
    private lateinit var postButton: Button

    private var selectedImage: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        imageView = findViewById(R.id.imagePreview)
        caption = findViewById(R.id.captionEditText)
        postButton = findViewById(R.id.postButton)

        imageView.setOnClickListener {
            // Image Picker Launcher
        }

        postButton.setOnClickListener {
            uploadPost()
        }
    }

    private fun uploadPost() {
        // Upload to Firebase Storage
        // Get Download URL
        // Save Post in Firestore
    }
}
