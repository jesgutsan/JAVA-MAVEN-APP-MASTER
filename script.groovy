def buildApp() {
    echo "building the applications..."
}

def testApp() {
    echo "test de aplications..."
} 

def deployApp() {
    echo 'Deploying..'
    echo "Deploying version ${params.VERSION}"
} 

return this