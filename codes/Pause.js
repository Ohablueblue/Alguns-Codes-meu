function sleep(ms) {
	return new Promise((resolve, reject) =>
		setTimeout(() => {
			resolve(true);
		}, ms);
		]);
}

sleep(5000).then(() => {
	console.log("Pronto");
});