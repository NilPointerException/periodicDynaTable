<template>
  <div>
    <!--Need to implement a grid system here based on the -->
  </div>
</template>

<script>
export default {
    data: {
        atoms: {}
    },
  methods: {
    fetchData() {
      fetch("THEAPIROUTETOFETCH", { //Fetch returns a promise
        method: GET,
        headers: {
          "theAPIKEY ?": "KEY"
        },
      }).then((response) => { //Here is the "promise" returned by the fetch JS API 
        if (response.ok) {
          return response.json; //Function wich return another "promise" Maybe don't need to transform the json into json... but have to test with the API
        } else { 
            alert("Something went wrong : " + response.status + ' ' + response.statusText);
        }
      }).then(response => { () //.json promise retrieved here
          this.data.atoms = response //Need to check the response.body instead but not sure...
      }).catch(err => {
          console.log(err)
      });
    },
  },
};
</script>

<style>
</style>