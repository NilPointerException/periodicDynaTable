<template>
  <div>
    <!--Need to implement a grid system here based on the -->
    <AtomCard
      v-for="atom in atoms"
      v-bind:key="atom.id"
      v-bind:atomNumber="atom.id"
      v-bind:symbol="atom.abbreviation"
      v-bind:atomicMass="atom.nom"
    />
  </div>
</template>

<script>
import AtomCard from "./AtomCard";

export default {
  components: {
    AtomCard,
  },
  name: "Table",
  data: function () {
    return {
      atoms: {},
    };
  },
  created: function () {
    var APIData = this.fakeData();

    APIData.atomeList.forEach((element) => {
      this.atoms = element;
      //console.log(this.atoms)
    });
    console.log(this.atoms);
  },
  methods: {
    fakeData() {
      return {
        atomeList: [
          { id: 1, nom: "Azote", abbreviation: "N2" },
          { id: 2, nom: "Oxygène", abbreviation: "O2" },
          { id: 3, nom: "Hydrogène", abbreviation: "H" },
        ],
      };
    },

    fetchData() {
      fetch("THEAPIROUTETOFETCH", {
        //Fetch returns a promise
        method: "GET",
        headers: {
          "theAPIKEY ?": "KEY",
        },
      })
        .then((response) => {
          //Here is the "promise" returned by the fetch JS API
          if (response.ok) {
            return response.json; //Function wich return another "promise" Maybe don't need to transform the json into json... but have to test with the API
          } else {
            alert(
              "Something went wrong : " +
                response.status +
                " " +
                response.statusText
            );
          }
        })
        .then((response) => {
          //.json promise retrieved here
          this.data.atoms = response; //Need to check the response.body instead but not sure...
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
};
</script>

<style>
</style>