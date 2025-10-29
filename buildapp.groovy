def call() {
    echo "Building the app..."
    sh 'mvn clean package'
}
