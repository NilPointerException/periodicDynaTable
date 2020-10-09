<template>
  <div class="card col-3" style="width: 18rem">
    Atomic Number<p class="primary">{{this.atomNumber}}</p>

    <div class="card-body">
      <div class="bg-primary">
<h5 class="card-title">Symbol{{this.symbol}}</h5>
      </div>
      
      <p class="card-text">
        Quick description if possible
      </p>
      <hr />
      <p>Atomic mass</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "AtomCard",
  data: function () {
    return {
      symbol: "",
      atomNumber: "",
      atomicMass: "",
    };
  },
};
</script>